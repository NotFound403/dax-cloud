package cn.felord.security.config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 15:46
 */
public class SecurityConfig  extends AuthorizationServerConfigurerAdapter {
    @Resource
    private DataSource  dataSource;


    private static final String SECRET_KEY="JLOSJNIA12AD3K";
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
/*        clients.inMemory() // 使用in-memory存储
                .withClient("client") // client_id
                .secret("secret") // client_secret
                .authorizedGrantTypes("authorization_code") // 该client允许的授权类型
                .scopes("app"); // 允许的授权范围*/
        PasswordEncoder  passwordEncoder=new StandardPasswordEncoder(SECRET_KEY);
     clients.jdbc(dataSource).passwordEncoder(passwordEncoder).withClient("clientid").secret("secret").autoApprove().scopes("app");

    }
}
