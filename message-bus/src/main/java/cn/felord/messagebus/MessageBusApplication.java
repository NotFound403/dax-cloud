package cn.felord.messagebus;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 消息总线
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 13:35
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@ComponentScan({"cn.felord.messagebus", "cn.felord.feign"})
public class MessageBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageBusApplication.class, args);
    }
}
