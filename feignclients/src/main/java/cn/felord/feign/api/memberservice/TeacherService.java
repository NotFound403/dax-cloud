package cn.felord.feign.api.memberservice;

import cn.felord.common.entity.dto.TeacherDTO;
import cn.felord.feign.api.memberservice.hystrix.TeacherServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Park service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:33
 */
@FeignClient(value = "MEMBERS-SERVICE", fallback = TeacherServiceImpl.class)
public interface TeacherService {
    /**
     * Find by card id yoyo teacher dto.
     *
     * @param cardId the card id
     * @return the yoyo teacher dto
     */
    @PostMapping("/teacher/feign/findbycardid")
    TeacherDTO findByCardId(@RequestParam("cardId") String cardId);
}
