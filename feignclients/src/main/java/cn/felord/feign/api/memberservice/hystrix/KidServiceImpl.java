package cn.felord.feign.api.memberservice.hystrix;

import cn.felord.common.entity.dto.KidDTO;
import cn.felord.feign.api.memberservice.KidService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/15 15:23
 */
@Component
public class KidServiceImpl implements KidService {
    private static final Logger log = LoggerFactory.getLogger(KidService.class);


    @Override
    public KidDTO findById(Long kidId) {
        Log.serviceDown(log, "MEMBERS-SERVICE");
        return null;
    }
}
