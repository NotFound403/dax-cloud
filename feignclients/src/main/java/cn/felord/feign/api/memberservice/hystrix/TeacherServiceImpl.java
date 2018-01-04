package cn.felord.feign.api.memberservice.hystrix;

import cn.felord.common.entity.dto.TeacherDTO;
import cn.felord.feign.api.memberservice.TeacherService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/15 15:20
 */
@Component
public class TeacherServiceImpl implements TeacherService {
    private static final Logger log = LoggerFactory.getLogger(TeacherService.class);

    @Override
    public TeacherDTO findByCardId(String cardId) {
        Log.serviceDown(log, "MEMBERS-SERVICE");
        return null;
    }
}
