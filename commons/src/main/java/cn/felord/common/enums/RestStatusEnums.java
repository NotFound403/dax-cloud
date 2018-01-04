package cn.felord.common.enums;

import cn.felord.common.entity.system.Rest;

/**
 * The enum Rest status enums.
 *
 * @author dax.
 * @version v1.0
 * @see Rest
 * @since 2017 /11/8 13:41
 */
public enum RestStatusEnums {


    /**
     * Ok response rest status enums.
     */
    OK_RESPONSE(200, "请求成功"),
    /**
     * Bad request rest status enums.
     */
    BAD_REQUEST(700,"业务操作失败"),
    /**
     * Forbidden response rest status enums.
     */
    FORBIDDEN_RESPONSE(403, "拒绝操作"),
    /**
     * Failure response rest status enums.
     */
    FAILURE_RESPONSE(500, "错误、不匹配等"),

    /**
     * 不可用于业务 用于处理 服务器错误的返回.
     */
    SERVER_ERROR_CODE(508, "app接口 服务器错误状态码");

    RestStatusEnums(int status, String desc) {
        this.desc = desc;
        this.status = status;
    }

    private int status;
    private String desc;

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
