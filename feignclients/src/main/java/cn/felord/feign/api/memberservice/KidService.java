package cn.felord.feign.api.memberservice;

import cn.felord.common.entity.dto.KidDTO;
import cn.felord.feign.api.memberservice.hystrix.KidServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Kid service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:34
 */
@FeignClient(value = "MEMBERS-SERVICE", fallback = KidServiceImpl.class)
public interface KidService {

    /**
     * Find by park class id kid dto.
     *
     * @param kidId the kid id
     * @return the kid dto
     */
    @PostMapping("/kid/feign/findbyid")
    KidDTO findById(@RequestParam("kidId") Long kidId);
}
