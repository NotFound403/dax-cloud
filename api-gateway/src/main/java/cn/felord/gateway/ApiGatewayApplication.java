package cn.felord.gateway;

import com.netflix.zuul.FilterProcessor;
import cn.felord.gateway.filter.ExpandProcessZuulFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * API 网关
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/22 9:33
 */
@SpringCloudApplication
@EnableZuulProxy
@EnableFeignClients(basePackages = {"cn.felord.feign.api"})
@EnableTransactionManagement
@MapperScan("cn.felord.gateway.mapper*")
@ComponentScan({"cn.felord.gateway", "cn.felord.feign"})
public class ApiGatewayApplication {
    private static final Logger log = LoggerFactory.getLogger(ApiGatewayApplication.class);


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        log.info("starting zuul api gateway");

        FilterProcessor.setProcessor(new ExpandProcessZuulFilter());
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
