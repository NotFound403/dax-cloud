package cn.felord.common.entity.securityserver.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/29 10:11
 */

public class UserDTO implements Serializable {

    private static final long serialVersionUID = -5794078154179296322L;
    private String userName;
    private String password;
    private String companyId;

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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "{" +
                "userName:" + userName +
                ", password:" + password +
                ", companyId:" + companyId +
                '}';
    }
}
