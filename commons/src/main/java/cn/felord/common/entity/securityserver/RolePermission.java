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
@TableName("role_permission")
public class RolePermission  extends Model<RolePermission> {

    private static final long serialVersionUID = -6627055103456584386L;
    @TableId(type = IdType.UUID)
    private String rolePermissionId;
    private String permissionId;
    private String roleId;


    public String getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(String rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }


    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "{" +
                "rolePermissionId:" + rolePermissionId +
                ", permissionId:" + permissionId +
                ", roleId:" + roleId +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.rolePermissionId;
    }
}
