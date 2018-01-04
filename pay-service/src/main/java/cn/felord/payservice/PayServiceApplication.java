package cn.felord.payservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 支付服务
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/21 13:35
 */
@SpringCloudApplication
@EnableFeignClients
@EnableTransactionManagement
public class PayServiceApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(PayServiceApplication.class, args);
	}
}
