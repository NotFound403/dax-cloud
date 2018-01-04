package cn.felord.cookbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 11:35
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@EnableTransactionManagement
@MapperScan("cn.felord.cookbook.mapper*")
@ComponentScan({"cn.felord.cookbook", "cn.felord.feign"})
public class CookbookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookbookServiceApplication.class, args);
	}
}
