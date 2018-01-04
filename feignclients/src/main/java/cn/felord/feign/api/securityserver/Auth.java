package cn.felord.feign.api.securityserver;

import cn.felord.common.entity.jwt.Claims;
import cn.felord.feign.api.securityserver.hystrix.AuthImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Auth.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/24 13:11
 */
@FeignClient(value = "SECURITY-SERVER", fallback = AuthImpl.class)
public interface Auth {
    /**
     * 调用安全中心 解析jwt.
     *
     * @param token the token
     * @return the rest
     */
    @RequestMapping("/token/claims")
    Claims claims(@RequestParam("token") String token);

    /**
     * 校验 jwt.
     *
     * @param token the token
     * @return the rest
     */
    @RequestMapping("/token/verify")
    boolean verify(@RequestParam("token") String token);

    /**
     * 颁发 jwt  token.
     *
     * @param userCredentials the user credentials
     * @return the rest
     */
    @RequestMapping("/token/authorize")
    String authorize(@RequestParam("userCredentials") String userCredentials);
}
