package cn.felord.messagebus.config;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;

/**
 * 处理队列 消息 乱码
 *
 * @author dax.
 * @version v1.0
 * @since 2017/12/6 14:25
 */

public class EncodingMessagePostProcessor implements MessagePostProcessor {
    @Override
    public Message postProcessMessage(Message message) throws AmqpException {
        MessageProperties messageProperties= message.getMessageProperties();
        messageProperties.setContentEncoding("UTF-8");
        return message;
    }
}
