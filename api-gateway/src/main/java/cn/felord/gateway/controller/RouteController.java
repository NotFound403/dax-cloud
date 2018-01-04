package cn.felord.gateway.controller;

import cn.felord.gateway.enums.BooleanEnums;
import cn.felord.gateway.service.IRouterService;
import cn.felord.common.entity.gateway.Router;
import cn.felord.common.entity.system.Rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 网关路由管理.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 15:07
 */
@RestController
@RequestMapping("/router")
public class RouteController {
    @Resource
    private IRouterService iRouterService;

    /**
     * Add route rest.
     *
     * @param router the router
     * @return the rest
     */
    @GetMapping("/add")
    public Rest addRoute(Router router) {
        iRouterService.insert(router);
        return Rest.ok();
    }

    /**
     * Update route rest.
     *
     * @param router the router
     * @return the rest
     */
    @GetMapping("/update")
    public Rest updateRoute(Router router) {
        iRouterService.updateById(router);
        return Rest.ok();
    }

    /**
     * Stop router rest.
     *
     * @param routerId the router id
     * @return the rest
     */
    @GetMapping("/stop")
    public Rest stopRouter(String routerId) {
        iRouterService.routeSwitcher(routerId, BooleanEnums.FALSE);
        return Rest.ok();
    }

    /**
     * Start router rest.
     *
     * @param routerId the router id
     * @return the rest
     */
    @GetMapping("/start")
    public Rest startRouter(String routerId) {
        iRouterService.routeSwitcher(routerId, BooleanEnums.TRUE);
        return Rest.ok();
    }

}
