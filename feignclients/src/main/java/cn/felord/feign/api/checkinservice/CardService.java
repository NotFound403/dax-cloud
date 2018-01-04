package cn.felord.feign.api.checkinservice;

import cn.felord.common.entity.system.Rest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Card service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 17:04
 */
@FeignClient(value = "CHECKIN-SERVICE")
public interface CardService {
    /**
     * Update status rest.
     *
     * @param cardId the card id
     * @param status the status
     * @return the rest
     */
    @PostMapping("/card/update/status")
    Rest updateStatus(@RequestParam("cardId") String cardId,@RequestParam("status") Long status);
}
