package cn.felord.feign.api.memberservice.hystrix;

import cn.felord.common.entity.Parent;
import cn.felord.feign.api.memberservice.ParentService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/15 15:22
 */
@Component
public class ParentServiceImpl implements ParentService {
    private static final Logger log = LoggerFactory.getLogger(ParentService.class);

    @Override
    public Parent selectById(Long parentId) {
        Log.serviceDown(log, "MEMBERS-SERVICE");
        return null;
    }
}
