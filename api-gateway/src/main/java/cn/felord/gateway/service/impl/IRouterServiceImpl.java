package cn.felord.gateway.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.gateway.enums.BooleanEnums;
import cn.felord.gateway.mapper.RouterMapper;
import cn.felord.gateway.service.IRouterService;
import cn.felord.common.entity.gateway.Router;
import cn.felord.common.entity.gateway.RouterDTO;
import cn.felord.common.entity.gateway.SensitiveHeader;
import com.xiaoleilu.hutool.util.CollectionUtil;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/20 11:21
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IRouterServiceImpl extends ServiceImpl<RouterMapper,Router> implements IRouterService {
    @Resource
    private RouterMapper routerMapper;

    @Override
    public List<RouterDTO> findAvailable() {
        return routerMapper.findAvailable();
    }

    @Override
    public Map<String, ZuulProperties.ZuulRoute> initRoutersFromDB() {
        Map<String, ZuulProperties.ZuulRoute> routeMap = new LinkedHashMap<>();
        List<RouterDTO> routerDTOS = routerMapper.findAvailable();
        if (CollectionUtil.isNotEmpty(routerDTOS)) {
            for (RouterDTO routerDTO : routerDTOS) {
                String key = routerDTO.getRouterId();
                routeMap.put(key, stream(routerDTO));
            }
        }
        return routeMap;
    }

    @Override
    public Integer routeSwitcher(String routerId, BooleanEnums booleanEnums) {
        return routerMapper.routeSwitcher(routerId, booleanEnums.getKey());
    }


    private ZuulProperties.ZuulRoute stream(RouterDTO routerDTO) {
        ZuulProperties.ZuulRoute zuulRoute = new ZuulProperties.ZuulRoute();

        String id = routerDTO.getRouterId();
        String serviceId = routerDTO.getServiceId();
        String url = routerDTO.getUrl();
        boolean stripPrefix = routerDTO.getStripPrefix().equals(BooleanEnums.TRUE.getKey());
        String path = routerDTO.getPath();
        boolean retryable = routerDTO.getRetryable().equals(BooleanEnums.TRUE.getKey());
        boolean customSensitiveHeaders = routerDTO.getCustomSensitiveHeaders().equals(BooleanEnums.TRUE.getKey());

        Set<SensitiveHeader> sensitiveHeaders = routerDTO.getSensitiveHeaders();

        zuulRoute.setId(id);
        zuulRoute.setServiceId(serviceId);
        zuulRoute.setServiceId(serviceId);
        zuulRoute.setUrl(url);
        zuulRoute.setCustomSensitiveHeaders(customSensitiveHeaders);
        zuulRoute.setRetryable(retryable);
        zuulRoute.setStripPrefix(stripPrefix);
        zuulRoute.setPath(path);

        if (CollectionUtil.isNotEmpty(sensitiveHeaders)) {
            Set<String> headers = new HashSet<>();

            for (SensitiveHeader sensitiveHeader : sensitiveHeaders) {
                String header = sensitiveHeader.getHeader();
                headers.add(header);
            }
            if (headers.size() > 0) {
                zuulRoute.setSensitiveHeaders(headers);
            }
        }
        return zuulRoute;
    }
}
