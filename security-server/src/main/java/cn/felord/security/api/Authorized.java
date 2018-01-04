package cn.felord.security.api;


import cn.felord.common.entity.jwt.Claims;
import cn.felord.common.enums.JwtTypeEnums;

import java.io.IOException;

/**
 * The interface Authorized.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/24 11:08
 */
public interface Authorized {

    /**
     * TOKEN 校验.
     *
     * @param token the token
     * @return the boolean
     * @throws Exception the exception
     */
    boolean verify(String token) throws Exception;

    /**
     * 解析 TOKEN.
     *
     * @param token the token
     * @return the claims
     * @throws IOException the io exception
     */
    Claims claims(String token) throws IOException;


    /**
     * 用户授权TOKEN.
     *
     * @param userCredentials the user credentials
     * @param jwtTypeEnums    the jwt type enums
     * @return the string
     */
    String authorize(String userCredentials, JwtTypeEnums jwtTypeEnums);
}
