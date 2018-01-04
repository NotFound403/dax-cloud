package cn.felord.messagebus.config;

import cn.felord.messagebus.enums.UnitEnums;
import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Mq config.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/5 10:40
 */
@Configuration
public class MqConfig {


    private static final String DEAD_LETTER_QUEUE_KEY = "x-dead-letter-exchange";
    private static final String DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";

    /**
     * Jackson 消息转换器.
     *
     * @return the message converter
     */
    @Bean
    public MessageConverter jacksonConverter() {
        return new Jackson2JsonMessageConverter();
    }

    /* ------------------------------------------------------------------------SMS------------------------------------------------------------------- */


    /**
     * Sms exchange exchange.
     *
     * @return the exchange
     */
    @Bean
    public Exchange smsExchange() {
        return exchange(UnitEnums.SMS);
    }

    /**
     * Sms dead letter queue queue.
     *
     * @return the queue
     */
    @Bean
    public Queue smsDeadLetterQueue() {

        return deadLetterQueue(UnitEnums.SMS);
    }

    /**
     * Repeat queue queue.
     *
     * @return the queue
     */
    @Bean
    public Queue smsRepeatQueue() {
        return repeatQueue(UnitEnums.SMS);
    }

    /**
     * Dead letter binding binding.
     *
     * @return the binding
     */
    @Bean
    public Binding smsDeadLetterBinding() {
        return deadLetterBinding(UnitEnums.SMS);
    }

    /**
     * Repeat binding binding.
     *
     * @return the binding
     */
    @Bean
    public Binding smsRepeatBinding() {
        return repeatBinding(UnitEnums.SMS);
    }



    /* ------------------------------------------------------------------------UPLOAD------------------------------------------------------------------- */

    /**
     * Sms exchange exchange.
     *
     * @return the exchange
     */
    @Bean
    public Exchange uploadExchange() {
        return exchange(UnitEnums.UPLOAD);
    }

    /**
     * Sms dead letter queue queue.
     *
     * @return the queue
     */
    @Bean
    public Queue uploadDeadLetterQueue() {

        return deadLetterQueue(UnitEnums.UPLOAD);
    }

    /**
     * Repeat queue queue.
     *
     * @return the queue
     */
    @Bean
    public Queue uploadRepeatQueue() {
        return repeatQueue(UnitEnums.UPLOAD);
    }

    /**
     * Dead letter binding binding.
     *
     * @return the binding
     */
    @Bean
    public Binding uploadDeadLetterBinding() {
        return deadLetterBinding(UnitEnums.UPLOAD);
    }

    /**
     * Repeat binding binding.
     *
     * @return the binding
     */
    @Bean
    public Binding uploadRepeatBinding() {
        return repeatBinding(UnitEnums.UPLOAD);
    }


    private Exchange exchange(UnitEnums unitEnums) {
        if (ExchangeTypes.TOPIC.equals(unitEnums.getExchangeType())) {
            return ExchangeBuilder.topicExchange(unitEnums.getExchange()).durable(true).build();
        }
        if (ExchangeTypes.FANOUT.equals(unitEnums.getExchangeType())) {
            return ExchangeBuilder.fanoutExchange(unitEnums.getExchange()).durable(true).build();
        }
        if (ExchangeTypes.HEADERS.equals(unitEnums.getExchangeType())) {
            return ExchangeBuilder.headersExchange(unitEnums.getExchange()).durable(true).build();
        }
        return ExchangeBuilder.directExchange(unitEnums.getExchange()).durable(true).build();
    }


    private Queue deadLetterQueue(UnitEnums unitEnums) {
        Map<String, Object> args = new HashMap<>(2);
        args.put(DEAD_LETTER_QUEUE_KEY, unitEnums.getExchange());
        args.put(DEAD_LETTER_ROUTING_KEY, unitEnums.getDeadLetterQueue());
        return QueueBuilder.durable(unitEnums.getDeadLetterQueue()).withArguments(args).build();
    }

    private Queue repeatQueue(UnitEnums unitEnums) {
        return QueueBuilder.durable(unitEnums.getQueue()).build();
    }


    /**
     * 死信队列交换机路由绑定
     *
     * @param unitEnums 队列定义
     * @return 绑定
     */
    private static Binding deadLetterBinding(UnitEnums unitEnums) {
        return new Binding(unitEnums.getDeadLetterQueue(), Binding.DestinationType.QUEUE, unitEnums.getExchange(), unitEnums.getQueue(), null);
    }

    /**
     * 监听队列交换机路由绑定
     *
     * @param unitEnums 队列定义
     * @return 绑定
     */
    private static Binding repeatBinding(UnitEnums unitEnums) {
        return new Binding(unitEnums.getQueue(), Binding.DestinationType.QUEUE, unitEnums.getExchange(), unitEnums.getDeadLetterQueue(), null);
    }
}
