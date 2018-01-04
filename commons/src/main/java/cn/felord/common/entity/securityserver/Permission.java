package cn.felord.common.entity.securityserver;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 13:41
 */
@TableName("permission")
public class Permission  extends Model<Permission> {

    private static final long serialVersionUID = -2439612729625377303L;
    @TableId(type = IdType.UUID)
    private String permissionId;
    private String resourceId;
    private String type;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "permissionId:" + permissionId +
                ", resourceId:" + resourceId +
                ", type:" + type +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.permissionId;
    }
}
