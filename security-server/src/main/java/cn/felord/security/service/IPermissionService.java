package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.Permission;

/**
 * The interface Permission service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 11:44
 */
public interface IPermissionService extends IService<Permission> {

    /**
     * Find by type permission.
     *
     * @param resourceId the resource id
     * @return the permission
     */
    Permission findByType(String resourceId );
}
