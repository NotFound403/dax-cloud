package cn.felord.messagebus.config;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;

/**
 * 代理消息延时处理器
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 9:39
 */
public class DelegateMessagePostProcessor implements MessagePostProcessor {
    /**
     * 延时消费毫秒数
     */
    private long delayTimeMillis;


    /**
     * Instantiates a new Delegate message post processor.
     *
     * @param delayTimeMillis the delay time millis
     */
    public DelegateMessagePostProcessor(long delayTimeMillis) {
        this.delayTimeMillis = delayTimeMillis;
    }

    @Override
    public Message postProcessMessage(Message message) throws AmqpException {

        MessageProperties messageProperties = message.getMessageProperties();
        messageProperties.setExpiration(String.valueOf(delayTimeMillis));
        messageProperties.setContentEncoding("UTF-8");
        return message;
    }
}
