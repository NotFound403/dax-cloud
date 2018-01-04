package cn.felord.messagebus.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 短信消息监听消费.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 15:00
 */
@Component
public class SmsConsumer implements RabbitMessageListener {
    private static final String QUEUE_NAME = "SMS_QUEUE";
    private static final Logger log = LoggerFactory.getLogger(SmsConsumer.class);


    /**
     * On.
     *
     * @param message the message
     */
    @Override
    @RabbitListener(queues = {QUEUE_NAME})
    public void on(Message message) {

    }

}
