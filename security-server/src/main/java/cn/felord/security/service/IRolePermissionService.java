package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.RolePermission;

/**
 * The interface Role permission service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 13:11
 */
public interface IRolePermissionService extends IService<RolePermission> {
    /**
     * Check role permission.
     *
     * @param roleId       the role id
     * @param permissionId the permission id
     * @return the role permission
     */
    RolePermission check(String roleId,String permissionId);
}
