package cn.felord.messagebus.provider;

import cn.felord.messagebus.enums.UnitEnums;

/**
 * The interface Provider.
 *
 * @param <T> the type parameter
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 13:11
 */
public interface Provider<T> {

    /**
     * 信息延迟消费.
     *
     * @param unitEnums       the unit enums
     * @param message         the message
     * @param delayTimeMillis the delay time millis
     */
    void sendDelay(UnitEnums unitEnums, T message, long delayTimeMillis);

    /**
     * 使用默认定义延迟时间发送延迟消费信息.
     *
     * @param unitEnums the unit enums
     * @param message   the message
     */
    void sendDelay(UnitEnums unitEnums, T message);

    /**
     * 信息同步消费.
     *
     * @param unitEnums the unit enums
     * @param message   the message
     */
    void send(UnitEnums unitEnums, T message);

}
