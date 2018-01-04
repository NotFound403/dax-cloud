package cn.felord.feign.config;

import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/**
 * Feign multipart 类型支持 .
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 16:00
 */
@Configuration
public class FeignMultipartSupportConfig {
    /**
     * Multipart form encoder encoder.
     *
     * @return the encoder
     */
    @Bean
    @Primary
    @Scope("prototype")
    public Encoder multipartFormEncoder() {
        return new SpringMultipartEncoder();
    }


    /**
     * Multipart logger level feign . logger . level.
     *
     * @return the feign . logger . level
     */
    @Bean
    public feign.Logger.Level multipartLoggerLevel() {
        return feign.Logger.Level.FULL;
    }


}
