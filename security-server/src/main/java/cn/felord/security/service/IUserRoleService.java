package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.UserRole;

/**
 * The interface User role service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 13:14
 */
public interface IUserRoleService extends IService<UserRole> {
    /**
     * Check user role.
     *
     * @param userId the user id
     * @return the user role
     */
    UserRole check(String userId);
}
