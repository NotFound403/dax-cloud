package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.Permission;
import cn.felord.security.mapper.PermissionMapper;
import cn.felord.security.service.IPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * The type Permission service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 11:45
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IPermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public Permission findByType(String resourceId ) {
        return permissionMapper.findByType(resourceId );
    }
}
