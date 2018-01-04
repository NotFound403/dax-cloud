package cn.felord.feign.api.securityserver.hystrix;

import cn.felord.common.entity.jwt.Claims;
import cn.felord.feign.api.securityserver.Auth;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/15 15:36
 */
@Component
public class AuthImpl implements Auth {
    private static final Logger log = LoggerFactory.getLogger(Auth.class);

    @Override
    public Claims claims(String token) {
        Log.serviceDown(log, "MESSAGE-BUS");
        return null;
    }

    @Override
    public boolean verify(String token) {
        Log.serviceDown(log, "MESSAGE-BUS");
        return false;
    }

    @Override
    public String authorize(String userCredentials) {
        Log.serviceDown(log, "MESSAGE-BUS");
        return null;
    }
}
