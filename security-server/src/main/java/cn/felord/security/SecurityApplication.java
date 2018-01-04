package cn.felord.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 授权、鉴权中心
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 13:35
 */
@SpringCloudApplication
@EnableTransactionManagement
@MapperScan("cn.felord.security.mapper*")
@ComponentScan({"cn.felord.security", "cn.felord.feign"})
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
