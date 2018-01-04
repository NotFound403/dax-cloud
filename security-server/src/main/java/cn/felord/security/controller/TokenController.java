package cn.felord.security.controller;

import cn.felord.common.entity.jwt.Claims;
import cn.felord.common.enums.JwtTypeEnums;
import cn.felord.security.api.Authorized;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * The type Security controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/24 11:50
 */
@RestController
@RequestMapping("/token")
public class TokenController {
    @Resource
    private Authorized authorized;

    /**
     * 校验token.
     *
     * @param token the token
     * @return boolean 有效true  无效 false
     */
    @PostMapping("/verify")
    public boolean verify(String token) {
        boolean result = false;
        try {
            result = authorized.verify(token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 颁发token.
     *
     * @param userCredentials 用户凭证
     * @return string   token string
     */
    @PostMapping("/bak/authorize")
    public String authorize(String userCredentials) {

            return authorized.authorize(userCredentials, JwtTypeEnums.BACK_END);

    }

    /**
     * 解析token.
     *
     * @param token the token
     * @return the rest
     */
    @PostMapping("/claims")
    public Claims claims(String token) {
        try {
            return authorized.claims(token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
