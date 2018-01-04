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
@TableName("user_info")
public class User extends Model<User> {

    private static final long serialVersionUID = 627397885284175735L;
    @TableId(type = IdType.UUID)
    private String userId;
    private String userName;
    private String password;
    private String createUser;
    private String companyId;
    private Date createTime;
    private Date updateTime;
    private String updateUser;
    private String enabled;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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


    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }


    @Override
    public String toString() {
        return "{" +
                "userId:" + userId +
                ", userName:" + userName +
                ", createUser:" + createUser +
                ", companyId:" + companyId +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                ", updateUser:" + updateUser +
                ", enabled:" + enabled +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
}
