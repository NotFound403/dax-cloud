package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.Role;

/**
 * The interface Role service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 11:09
 */
public interface IRoleService extends IService<Role> {
    /**
     * Find by name role.
     *
     * @param roleName the role name
     * @return the role
     */
    Role findByName(String roleName);
}
