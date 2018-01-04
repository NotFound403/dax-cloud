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
@TableName("user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 4243547386239372969L;
    @TableId(type = IdType.UUID)
    private String userRoleId;
    private String userId;
    private String roleId;
    private String enabled;
    private Date createTime;
    private Date createUser;


    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Date createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "{" +
                "userRoleId:" + userRoleId +
                ", userId:" + userId +
                ", roleId:" + roleId +
                ", enabled:" + enabled +
                ", createTime:" + createTime +
                ", createUser:" + createUser +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.userRoleId;
    }
}
