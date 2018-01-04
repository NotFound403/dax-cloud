package cn.felord.members;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 用户服务
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 13:35
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@EnableTransactionManagement
@MapperScan("cn.felord.members.mapper*")
@ComponentScan({"cn.felord.members", "cn.felord.feign"})
public class MemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceApplication.class, args);
    }
}
