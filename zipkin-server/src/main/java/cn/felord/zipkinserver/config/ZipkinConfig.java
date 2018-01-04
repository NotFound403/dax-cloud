package cn.felord.zipkinserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin.storage.mysql.MySQLStorage;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 持久化链路追踪信息.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/14 16:43
 */
@Configuration
public class ZipkinConfig {
    @Resource
    private DataSource dataSource;

    /**
     * My sql storage my sql storage.
     *
     * @return the my sql storage
     */
    @Bean
    public MySQLStorage mySQLStorage() {
        return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
    }
}
