package cn.felord.common.enums;

/**
 * The enum Card status enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/1 10:52
 */
public enum CardStatusEnums {

    /**
     * Loss card status enums.
     */
    LOCK(2, "一卡通挂失");

    private long status;
    private String description;

    CardStatusEnums(long status, String description) {
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
