package cn.felord.common.enums;

/**
 * 设备管理人类型
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 15:00
 */
public enum YoyoDeviceManagerTypeEnums {

    /**
     * 超级管理员.
     */
    SUPER_ADMIN(0,"超级管理员"),
    /**
     * 代理商.
     */
    AGENT(1,"代理商");

    private long type;
    private String  description;

    YoyoDeviceManagerTypeEnums(long type, String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public long getType() {
        return type;
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
