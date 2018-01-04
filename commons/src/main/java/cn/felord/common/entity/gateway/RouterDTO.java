package cn.felord.common.entity.gateway;

import java.io.Serializable;
import java.util.Set;

/**
 * The type Router dto.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 11:46
 */
public class RouterDTO implements Serializable {
    private static final long serialVersionUID = 3899187885546937247L;

    /**
     * 路由的唯一编号  同时也默认为 装载路由的容器的Key 用来标识映射的唯一性 重要
     */
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
     * 敏感头列表
     */
    private Set<SensitiveHeader> sensitiveHeaders;


    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStripPrefix() {
        return stripPrefix;
    }

    public void setStripPrefix(String stripPrefix) {
        this.stripPrefix = stripPrefix;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRetryable() {
        return retryable;
    }

    public void setRetryable(String retryable) {
        this.retryable = retryable;
    }

    public String getCustomSensitiveHeaders() {
        return customSensitiveHeaders;
    }

    public void setCustomSensitiveHeaders(String customSensitiveHeaders) {
        this.customSensitiveHeaders = customSensitiveHeaders;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public Set<SensitiveHeader> getSensitiveHeaders() {
        return sensitiveHeaders;
    }

    public void setSensitiveHeaders(Set<SensitiveHeader> sensitiveHeaders) {
        this.sensitiveHeaders = sensitiveHeaders;
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
                ", sensitiveHeaders:" + sensitiveHeaders +
                '}';
    }
}
