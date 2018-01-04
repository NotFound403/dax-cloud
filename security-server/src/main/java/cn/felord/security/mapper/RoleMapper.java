package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.Role;
import org.apache.ibatis.annotations.Param;

/**
 * The interface Role mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 11:08
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * Find by name role.
     *
     * @param roleName the role name
     * @return the role
     */
    Role  findByName(@Param("roleName") String roleName);
}
