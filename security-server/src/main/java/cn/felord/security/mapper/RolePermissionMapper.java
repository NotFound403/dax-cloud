package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.RolePermission;
import org.apache.ibatis.annotations.Param;

/**
 * The interface Role permission mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 13:04
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    /**
     * Check role permission.
     *
     * @param roleId       the role id
     * @param permissionId the permission id
     * @return the role permission
     */
    RolePermission  check(@Param("roleId") String roleId, @Param("permissionId") String permissionId);
}
