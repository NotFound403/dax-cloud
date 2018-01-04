package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.User;
import cn.felord.common.entity.securityserver.dto.UserDetail;

/**
 * The interface User service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 10:57
 */
public interface IUserService extends IService<User> {
    /**
     * Find by name user.
     *
     * @param userName the user name
     * @return the user
     */
    User findByName(String userName);

    /**
     * Gets user detail.
     *
     * @param userId the user id
     * @return the user detail
     */
    UserDetail getUserDetail(String userId);

}
