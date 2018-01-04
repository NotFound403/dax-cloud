package cn.felord.common.entity.securityserver.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/29 10:59
 */

public class RoleDTO implements Serializable {
    private static final long serialVersionUID = 8377791511001397521L;

    private String roleName;
    private String parentId;
    private String description;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "roleName:" + roleName +
                ", parentId:" + parentId +
                ", description:" + description +
                '}';
    }
}
