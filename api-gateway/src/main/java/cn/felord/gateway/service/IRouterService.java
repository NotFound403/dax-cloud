package cn.felord.gateway.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.gateway.enums.BooleanEnums;
import cn.felord.common.entity.gateway.Router;
import cn.felord.common.entity.gateway.RouterDTO;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.List;
import java.util.Map;

/**
 * The interface Router service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 11:20
 */
public interface IRouterService extends IService<Router> {
    /**
     * Find available router dto.
     *
     * @return the router dto
     */
    List<RouterDTO> findAvailable();


    /**
     * Init routers from db map.
     *
     * @return the map
     */
    Map<String, ZuulProperties.ZuulRoute> initRoutersFromDB();

    /**
     * Route switcher integer.
     *
     * @param routerId     the router id
     * @param booleanEnums the boolen enums
     * @return the integer
     */
    Integer routeSwitcher(String routerId, BooleanEnums booleanEnums);
}
