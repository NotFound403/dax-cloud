package cn.felord.messagebus.provider;

import cn.felord.messagebus.config.DelegateMessagePostProcessor;
import cn.felord.messagebus.config.EncodingMessagePostProcessor;
import cn.felord.messagebus.enums.UnitEnums;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Rabbit 生产者.
 *
 * @param <T> the type parameter
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 10:49
 */
@Component
public class RabbitProvider<T> implements Provider<T> {
    @Resource
    private RabbitTemplate rabbitTemplate;
    @Resource
    private MessageConverter jacksonConverter;
    @Override
    public void sendDelay(UnitEnums unitEnums, T message, long delayTimeMillis) {
        MessagePostProcessor messagePostProcessor = new DelegateMessagePostProcessor(delayTimeMillis);
        rabbitTemplate.setMessageConverter(jacksonConverter);
        rabbitTemplate.convertAndSend(unitEnums.getExchange(), unitEnums.getQueue(), message, messagePostProcessor);
    }

    @Override
    public void sendDelay(UnitEnums unitEnums, T message) {
        sendDelay(unitEnums, message, unitEnums.getDefaultDelayTimeMillis());
    }

    @Override
    public void send(UnitEnums unitEnums, T message) {
        MessagePostProcessor messagePostProcessor = new EncodingMessagePostProcessor();
        rabbitTemplate.setMessageConverter(jacksonConverter);
        rabbitTemplate.convertAndSend(unitEnums.getExchange(), unitEnums.getDeadLetterQueue(), message, messagePostProcessor);
    }

}
