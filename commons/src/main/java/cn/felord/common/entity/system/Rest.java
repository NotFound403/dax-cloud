package cn.felord.common.entity.system;


import cn.felord.common.enums.RestStatusEnums;

import java.io.Serializable;

/**
 * 接入网关层使用 内部调用直接返回实体.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/8 13:41
 */
public class Rest implements Serializable {

    private static final long serialVersionUID = 7767089117975581107L;
    private int code  ;

    private long count  ;

    private Object data;

    private String msg;

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Instantiates a new Rest.
     */
    public Rest() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Rest.
     *
     * @param code  the code
     * @param count the count
     * @param data  the data
     * @param msg   the msg
     */
    public Rest(int code, long count, Object data, String msg) {
        super();
        this.code = code;
        this.count = count;
        this.data = data;
        this.msg = msg;
    }

    /**
     * Ok rest.
     *
     * @return the rest
     */
    public static Rest ok() {
        return new Rest(RestStatusEnums.OK_RESPONSE.getStatus(), 0, null, "");
    }

    /**
     * 禁止操作.
     *
     * @param msg the msg
     * @return the rest
     */
    public static Rest forbidden(String msg) {
        return new Rest(RestStatusEnums.FORBIDDEN_RESPONSE.getStatus(), 0, null, msg);

    }

    /**
     * Forbidden rest.
     *
     * @return the rest
     */
    public static Rest forbidden() {
        return new Rest(RestStatusEnums.FORBIDDEN_RESPONSE.getStatus(), 0, null, "");

    }


    /**
     * Server error rest.
     *
     * @param msg the msg
     * @return the rest
     */
    public static Rest ServerError(String msg) {
        return new Rest(RestStatusEnums.SERVER_ERROR_CODE.getStatus(), 0, null, msg);

    }

    /**
     * Ok rest.
     *
     * @param msg the msg
     * @return the rest
     */
    public static Rest ok(String msg) {
        return new Rest(RestStatusEnums.OK_RESPONSE.getStatus(), 0, null, msg);
    }

    /**
     * Ok data rest.
     *
     * @param data the data
     * @return the rest
     */
    public static Rest okData(Object data) {
        return new Rest(RestStatusEnums.OK_RESPONSE.getStatus(), 0, data, "ok");
    }

    /**
     * Failure rest.
     *
     * @param msg the msg
     * @return the rest
     */
    public static Rest failure(String msg) {
        // TODO Auto-generated method stub
        return new Rest(RestStatusEnums.FAILURE_RESPONSE.getStatus(), 0, null, msg);
    }

    /**
     * Bad rest.
     *
     * @param msg the msg
     * @return the rest
     */
    public static Rest bad(String msg) {
        // TODO Auto-generated method stub
        return new Rest(RestStatusEnums.BAD_REQUEST.getStatus(), 0, null, msg);
    }


    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", count:" + count +
                ", data:" + data +
                ", msg:" + msg +
                '}';
    }
}
