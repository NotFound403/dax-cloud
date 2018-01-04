package cn.felord.gateway.config;

import cn.felord.gateway.service.IRouterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.CompositeRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 网关持久化 动态刷新
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 11:44
 */
@Configuration
public class ZuulConfig {
    private static final Logger log= LoggerFactory.getLogger("zuul");
    @Resource
    private IRouterService routerService;
    @Resource
    private ServerProperties serverProperties;

    /**
     * 将数据库的网关配置数据 写入配置  支持动态刷新
     *
     * @return the zuul properties
     */
    @Bean
    @RefreshScope
    public ZuulProperties zuulProperties() {
        ZuulProperties zuulProperties = new ZuulProperties();
        zuulProperties.setRoutes(routerService.initRoutersFromDB());
         log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> zuulProperties refreshed");
        return zuulProperties;
    }


    /**
     * 将配置写入可刷新的路由定位器  支持动态刷新.
     *
     * @param zuulProperties the zuul properties
     * @return the composite route locator
     */
    @Bean
    @ConditionalOnBean(ZuulProperties.class)
    @RefreshScope
    public CompositeRouteLocator compositeRouteLocator(@Qualifier("zuulProperties") ZuulProperties zuulProperties) {
        List<RouteLocator> routeLocators = new ArrayList<>();
        RouteLocator simpleRouteLocator = new SimpleRouteLocator(serverProperties.getServletPrefix(), zuulProperties);
        routeLocators.add(simpleRouteLocator);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> zuul routes refreshed");
        return new CompositeRouteLocator(routeLocators);
    }

}
