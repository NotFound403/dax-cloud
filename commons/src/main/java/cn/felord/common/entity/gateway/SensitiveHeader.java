package cn.felord.common.entity.gateway;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Objects;

/**
 * 路由敏感头.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 10:44
 */
@TableName("sensitiveheader")
public class SensitiveHeader extends Model<SensitiveHeader> {
    private static final long serialVersionUID = 1127538019970008837L;
    /**
     * @see Router#getRouterId()
     */
    private String routerId;
    /**
     * 头配置
     */
    private String header;
    /**
     * 是否可用
     */
    private String enable;


    /**
     * Gets router id.
     *
     * @return the router id
     */
    public String getRouterId() {
        return routerId;
    }

    /**
     * Sets router id.
     *
     * @param routerId the router id
     */
    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }


    /**
     * Gets header.
     *
     * @return the header
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header the header
     */
    public void setHeader(String header) {
        this.header = header;
    }


    /**
     * Gets enable.
     *
     * @return the enable
     */
    public String getEnable() {
        return enable;
    }

    /**
     * Sets enable.
     *
     * @param enable the enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "{" +
                "routerId:" + routerId +
                ", header:" + header +
                ", enable:" + enable +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveHeader)) {
            return false;
        }
        SensitiveHeader that = (SensitiveHeader) o;
        return Objects.equals(getRouterId(), that.getRouterId()) &&
                Objects.equals(getHeader(), that.getHeader()) &&
                Objects.equals(getEnable(), that.getEnable());
    }

    @Override
    protected Serializable pkVal() {
        return routerId;
    }
}
