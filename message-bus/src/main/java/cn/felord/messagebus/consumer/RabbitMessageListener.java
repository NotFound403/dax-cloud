package cn.felord.messagebus.consumer;

import org.springframework.amqp.core.Message;

/**
 * The interface Rabbit message listener.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 9:44
 */
public interface RabbitMessageListener {

    /**
     * On.
     *
     * @param message the message
     */
    void on(Message message);
}
