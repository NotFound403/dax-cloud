package cn.felord.common.entity.gateway;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 路由.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 10:44
 */
@TableName("router")
public class Router extends Model<Router> {
    private static final long serialVersionUID = 8786397837791830856L;
    /**
     * 路由的唯一编号  同时也默认为 装载路由的容器的Key 用来标识映射的唯一性 重要
     */
    @TableId(type = IdType.UUID)
    private String routerId;
    /**
     * 服务实例ID（如果有的话）来映射到此路由 你可以指定一个服务或者url 但是不能两者同时对于一个key来配置
     */
    private String serviceId;
    /**
     * see  serviceId
     */
    private String url;
    /**
     * 路由前缀是否在转发开始前被删除 默认是删除
     */
    private String stripPrefix;
    /**
     * 路由的规则 例如/foo/**
     */
    private String path;
    /**
     * 是否支持重试如果支持的话  通常需要服务实例id 跟ribbon
     */
    private String retryable;
    /**
     * sensitiveHeaders  是否生效 默认不生效
     */
    private String customSensitiveHeaders;
    /**
     * 路由是否可用
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
     * Gets service id.
     *
     * @return the service id
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets service id.
     *
     * @param serviceId the service id
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets strip prefix.
     *
     * @return the strip prefix
     */
    public String getStripPrefix() {
        return stripPrefix;
    }

    /**
     * Sets strip prefix.
     *
     * @param stripPrefix the strip prefix
     */
    public void setStripPrefix(String stripPrefix) {
        this.stripPrefix = stripPrefix;
    }

    /**
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets path.
     *
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Gets retryable.
     *
     * @return the retryable
     */
    public String getRetryable() {
        return retryable;
    }

    /**
     * Sets retryable.
     *
     * @param retryable the retryable
     */
    public void setRetryable(String retryable) {
        this.retryable = retryable;
    }

    /**
     * Gets custom sensitive headers.
     *
     * @return the custom sensitive headers
     */
    public String getCustomSensitiveHeaders() {
        return customSensitiveHeaders;
    }

    /**
     * Sets custom sensitive headers.
     *
     * @param customSensitiveHeaders the custom sensitive headers
     */
    public void setCustomSensitiveHeaders(String customSensitiveHeaders) {
        this.customSensitiveHeaders = customSensitiveHeaders;
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
                ", serviceId:" + serviceId +
                ", url:" + url +
                ", stripPrefix:" + stripPrefix +
                ", path:" + path +
                ", retryable:" + retryable +
                ", customSensitiveHeaders:" + customSensitiveHeaders +
                ", enable:" + enable +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return routerId;
    }
}
