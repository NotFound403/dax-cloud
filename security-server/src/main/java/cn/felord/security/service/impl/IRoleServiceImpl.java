package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.Role;
import cn.felord.security.mapper.RoleMapper;
import cn.felord.security.service.IRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/29 11:09
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IRoleServiceImpl extends ServiceImpl<RoleMapper,Role>  implements IRoleService{
    @Resource
    private RoleMapper roleMapper;
    @Override
    public Role findByName(String roleName) {
        return roleMapper.findByName(roleName);
    }
}
