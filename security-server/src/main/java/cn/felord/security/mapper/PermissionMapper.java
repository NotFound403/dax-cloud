package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.Permission;
import org.apache.ibatis.annotations.Param;

/**
 * The interface Permission mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 11:42
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * Find by type permission.
     *
     * @param resourceId the resource id
     * @return the permission
     */
    Permission findByType(@Param("resourceId") String resourceId);
}
