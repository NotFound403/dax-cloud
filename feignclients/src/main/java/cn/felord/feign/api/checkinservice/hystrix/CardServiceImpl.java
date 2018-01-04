package cn.felord.feign.api.checkinservice.hystrix;

import cn.felord.common.entity.system.Rest;
import cn.felord.feign.api.checkinservice.CardService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Card service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 17:07
 * @deprecated
 */

public class CardServiceImpl implements CardService {
    private static final Logger log = LoggerFactory.getLogger(CardService.class);

    @Override
    public Rest updateStatus(String cardId, Long status) {
        Log.serviceDown(log, "MEMBERS-SERVICE");
        return Rest.ServerError("服务不可用");
    }
}
