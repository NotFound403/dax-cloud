package cn.felord.messagebus.enums;

/**
 * The enum Mq args enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/5 15:30
 */
public enum MqArgsEnums {
    /**
     * Dead letter exchange key mq args enums.
     */
    DEAD_LETTER_EXCHANGE_KEY("x-dead-letter-exchange", "定义死信信道KEY"),
    /**
     * Dead letter routing key mq args enums.
     */
    DEAD_LETTER_ROUTING_KEY("x-dead-letter-routing-key", "定义死信路由KEY");

    private String key;
    private String description;

    MqArgsEnums(String key, String description) {
        this.key = key;
        this.description = description;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
