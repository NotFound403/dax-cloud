package cn.felord.messagebus.controller;

import cn.felord.common.entity.system.Rest;
import cn.felord.messagebus.enums.UnitEnums;
import cn.felord.messagebus.provider.RabbitProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Rabbit controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 11:03
 */
@RestController
@RequestMapping("/sms")
public class SmsRabbitController {

    @Resource
    private RabbitProvider<Rest> rabbitProvider;

    /**
     * Send delay.
     *
     * @return the rest
     */
    @PostMapping("/feign/send")
    public Rest sendDelay() {
        rabbitProvider.sendDelay(UnitEnums.SMS, Rest.ok(), 8000);
        return Rest.ok();
    }

}
