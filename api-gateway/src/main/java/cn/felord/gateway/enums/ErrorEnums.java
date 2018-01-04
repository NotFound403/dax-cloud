package cn.felord.gateway.enums;

/**
 * The enum Error enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/22 11:42
 */
public enum  ErrorEnums {
    /**
     * 响应状态码.
     */
    ERROR_STATUS_CODE("error.status_code", "响应状态码KEY"),
    ERROR_MESSAGE("error.message", "响应信息KEY"),
    ERROR_EXCEPTION("error.exception", "错误原因，,不处理POST阶段");

    private String key;
    private String description;

    ErrorEnums(String key, String description) {
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
