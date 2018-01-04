package cn.felord.common.enums;

/**
 *  jwt 类型定义.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/8 13:41
 */
public enum JwtTypeEnums {
    /**
     * App jwt type enums.
     */
    APP("T_00X01", "平台用户端"),

    /**
     * Back end jwt type enums.
     */
    BACK_END("T_0U002", "系统管理端");


    private String type;
    private String description;


    JwtTypeEnums(String type, String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
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
