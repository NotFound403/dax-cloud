package cn.felord.common.enums;

/**
 * The enum Yoyo device status enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 15:04
 */
public enum YoyoDeviceStatusEnums {

    /**
     * Disabled yoyo device status enums.
     */
    DISABLED(1, "不可用"),

    /**
     * Enable yoyo device status enums.
     */
    ENABLE(0, "可用");

    private long status;
    private String description;


    YoyoDeviceStatusEnums(long status, String description) {
        this.status = status;
        this.description = description;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public long getStatus() {
        return status;
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
