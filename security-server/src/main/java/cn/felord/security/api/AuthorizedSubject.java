package cn.felord.security.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import cn.felord.common.entity.jwt.Claims;
import cn.felord.common.entity.securityserver.User;
import cn.felord.common.enums.JwtTypeEnums;
import cn.felord.common.util.JacksonJsonParser;
import cn.felord.security.service.IUserService;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.RsaSigner;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;
import org.springframework.security.jwt.crypto.sign.SignatureVerifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Objects;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/24 11:14
 */
@Service
public class AuthorizedSubject implements Authorized {
    private static final long DEFAULT_EXPIRED=60*1000*60*2;

    @Resource
    private IUserService iUserService;

    @Override
    public boolean verify(String token) throws Exception {
        Jwt jwt = JwtHelper.decode(token);
        SignatureVerifier signatureVerifier = new RsaVerifier(KeyStore.publicKey());
        try {
            jwt.verifySignature(signatureVerifier);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Claims claims(String token) throws IOException {
        Jwt jwt = JwtHelper.decode(token);
        String claim = jwt.getClaims();

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(claim, Claims.class);
    }

    @Override
    public String authorize(String userCredentials, JwtTypeEnums jwtTypeEnums)   {
        if (JwtTypeEnums.BACK_END.equals(jwtTypeEnums)) {
         return backendAuthorize(userCredentials);
        }
        return  null;
    }

    private String backendAuthorize(String userCredentials)  {
        User user = iUserService.selectById(userCredentials);
        if (Objects.nonNull(user)){
            try {
                return token(userCredentials, JwtTypeEnums.BACK_END,DEFAULT_EXPIRED);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
       return null;

    }

    private String token(String userCredentials,JwtTypeEnums jwtTypeEnums,long expired) throws Exception {
        Claims claims = new Claims(userCredentials, true,expired, jwtTypeEnums);
        String segment = JacksonJsonParser.jsonBody(claims);
        RsaSigner rsaSigner = new RsaSigner(KeyStore.privateKey());
        Jwt jwt = JwtHelper.encode(segment, rsaSigner);
        return jwt.getEncoded();
    }
}
