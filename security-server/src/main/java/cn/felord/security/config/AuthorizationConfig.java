package cn.felord.security.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.annotation.Resource;

/**
 * The type Authorization config.
 *
 * @author dax.
 * @version v1.0
 * @since 2018 /1/4 9:49
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationConfig extends AuthorizationServerConfigurerAdapter {
    @Value("${resource.id:spring-boot-application}")
    private String resourceId;

    /**
     * The Access token validity seconds.
     */
    @Value("${access_token.validity_period:3600}")
    int accessTokenValiditySeconds = 3600;

    @Resource
    private AuthenticationManager authenticationManager;

    @Bean
    public ClientDetailsService clientDetailsService(){
        return new CustomClientDetailsService();
    }
    /**
     * Access token converter jwt access token converter.
     *
     * @return the jwt access token converter
     */
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        return new JwtAccessTokenConverter();
    }

    /**
     *
     *
     *
     * /oauth/authorize：验证
     * /oauth/token：获取token
     * /oauth/confirm_access：用户授权
     * /oauth/error：认证失败
     * /oauth/check_token：资源服务器用来校验token
     * /oauth/token_key：如果jwt模式则可以用此来从认证服务器获取公钥
     *
     *
     * @param endpoints 声明授权和token的端点以及token的服务的一些配置信息，比如采用什么存储方式、token的有效期等
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        endpoints
                .authenticationManager(this.authenticationManager)
                .accessTokenConverter(accessTokenConverter())
              /*  .pathMapping("","")
                .pathMapping("","")
                .pathMapping("","")*/;
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
        oauthServer.tokenKeyAccess("isAnonymous() || hasAuthority('ROLE_TRUSTED_CLIENT')")
                .checkTokenAccess("hasAuthority('ROLE_TRUSTED_CLIENT')");
    }

    /**
     *
     * @param clients  client的信息的读取
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) {
//        clients.withClientDetails()
    }
}
