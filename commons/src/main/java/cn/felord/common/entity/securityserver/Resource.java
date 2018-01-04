package cn.felord.common.entity.securityserver;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 13:41
 */
@TableName("resource")
public class Resource  extends Model<Resource> {

    private static final long serialVersionUID = -3559107570633132548L;
    @TableId(type = IdType.UUID)
    private String resourceId;
    private String resourceName;
    private String uri;
    private String parentId;
    private long sort;
    private String enabled;
    private String description;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;


    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public long getSort() {
        return sort;
    }

    public void setSort(long sort) {
        this.sort = sort;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "{" +
                "resourceId:" + resourceId +
                ", resourceName:" + resourceName +
                ", uri:" + uri +
                ", parentId:" + parentId +
                ", sort:" + sort +
                ", enabled:" + enabled +
                ", description:" + description +
                ", createTime:" + createTime +
                ", createUser:" + createUser +
                ", updateTime:" + updateTime +
                ", updateUser:" + updateUser +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.resourceId;
    }
}
