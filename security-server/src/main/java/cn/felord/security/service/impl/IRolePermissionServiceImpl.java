package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.RolePermission;
import cn.felord.security.mapper.RolePermissionMapper;
import cn.felord.security.service.IRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * The type Role permission service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 13:12
 */
@Service
public class IRolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public RolePermission check(String roleId, String permissionId) {
        return rolePermissionMapper.check(roleId, permissionId);
    }
}
