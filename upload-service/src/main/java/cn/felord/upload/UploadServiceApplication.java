package cn.felord.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 文件存取服务器
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 13:35
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@ComponentScan({"cn.felord.upload", "cn.felord.feign"})
public class UploadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadServiceApplication.class, args);
	}
}
