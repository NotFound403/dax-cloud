package cn.felord.messagebus.enums;

import org.springframework.amqp.core.ExchangeTypes;

/**
 * 消息队列定义  交换机 队列  路由Key
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/5 15:30
 */
public enum UnitEnums {
    /**
     * 短信队列.
     */
    SMS("SMS_QUEUE", "SMS_DL_QUEUE", "SMS_EXCHANGE", ExchangeTypes.DIRECT, 1000 * 60),
    /**
     * 上传队列.
     */
    UPLOAD("UPLOAD_QUEUE", "UPLOAD_DL_QUEUE", "UPLOAD_EXCHANGE",ExchangeTypes.DIRECT, 1000 * 60);

    private String queue;
    private String deadLetterQueue;
    private String exchange;
    private String exchangeType;
    private long defaultDelayTimeMillis;

    UnitEnums(String queue, String deadLetterQueue, String exchange,String exchangeType, long defaultDelayTimeMillis) {
        this.queue = queue;
        this.deadLetterQueue = deadLetterQueue;
        this.exchange = exchange;
        this.exchangeType=exchangeType;
        this.defaultDelayTimeMillis = defaultDelayTimeMillis;
    }

    /**
     * Gets queue.
     *
     * @return the queue
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Gets dead letter queue.
     *
     * @return the dead letter queue
     */
    public String getDeadLetterQueue() {
        return deadLetterQueue;
    }

    /**
     * Gets exchange.
     *
     * @return the exchange
     */
    public String getExchange() {
        return exchange;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    /**
     * Gets default delay time millis.
     *
     * @return the default delay time millis
     */
    public long getDefaultDelayTimeMillis() {
        return defaultDelayTimeMillis;
    }
}
