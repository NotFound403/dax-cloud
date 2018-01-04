package cn.felord.feign.api.memberservice;

import cn.felord.common.entity.Parent;
import cn.felord.feign.api.memberservice.hystrix.ParentServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Parent service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:33
 */
@FeignClient(value = "MEMBERS-SERVICE", fallback = ParentServiceImpl.class)
public interface ParentService {

    /**
     * Select by id parent.
     *
     * @param parentId the parent id
     * @return the parent
     */
    @PostMapping("/parent/feign/findbyid")
    Parent selectById(@RequestParam("parentId") Long parentId);
}
