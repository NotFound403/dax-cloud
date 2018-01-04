package cn.felord.homework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/25 13:06
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@EnableTransactionManagement
@MapperScan("cn.felord.homework.mapper*")
@ComponentScan({"cn.felord.homework", "cn.felord.feign"})
public class HomeworkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkServiceApplication.class, args);
    }
}
