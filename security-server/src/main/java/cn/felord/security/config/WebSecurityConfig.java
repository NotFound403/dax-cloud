package cn.felord.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.servlet.http.HttpServletResponse;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/1/4 16:59
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
                http.csrf().disable().exceptionHandling().authenticationEntryPoint(
                  (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED)).and()
                      .authorizeRequests().antMatchers("/**").authenticated().and().httpBasic();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("reader").password("reader").authorities("FOO_READ").and()
                .withUser("writer").password("writer").authorities("FOO_READ", "FOO_WRITE");

        //        auth.jdbcAuthentication();
    }

}
