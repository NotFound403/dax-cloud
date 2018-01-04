package cn.felord.common.entity.securityserver.dto;

import java.io.Serializable;
import java.util.List;

/**
 * The type User dtail.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 15:18
 */
public class UserDetail implements Serializable {

    private static final long serialVersionUID = -7827148067762072110L;
    private String userId;
    private String roleId;
    private String   roleName;
    private List<ResourceDetail> resourceDetails;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets resource details.
     *
     * @return the resource details
     */
    public List<ResourceDetail> getResourceDetails() {
        return resourceDetails;
    }

    /**
     * Sets resource details.
     *
     * @param resourceDetails the resource details
     */
    public void setResourceDetails(List<ResourceDetail> resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    @Override
    public String toString() {
        return "{" +
                "userId:" + userId +
                ", roleId:" + roleId +
                ", roleName:" + roleName +
                ", resourceDetails:" + resourceDetails +
                '}';
    }
}
