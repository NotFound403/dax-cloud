package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.UserRole;
import org.apache.ibatis.annotations.Param;

/**
 * The interface User role mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 13:02
 */
public interface UserRoleMapper extends BaseMapper<UserRole>{
    /**
     * 用户 角色检查.
     *
     * @param userId the user id
     * @return the user role
     */
    UserRole  check(@Param("userId") String userId);
}
