package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.UserRole;
import cn.felord.security.mapper.UserRoleMapper;
import cn.felord.security.service.IUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/29 13:14
 */
@Service
public class IUserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRole check(String userId) {
        return userRoleMapper.check(userId);
    }
}
