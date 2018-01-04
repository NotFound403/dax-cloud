package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.dto.UserDetail;
import cn.felord.security.mapper.ResourceMapper;
import cn.felord.security.mapper.UserMapper;
import cn.felord.security.service.IResourceService;
import cn.felord.security.service.IUserService;
import cn.felord.common.entity.securityserver.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/28 10:58
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IUserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
@Resource
private UserMapper userMapper;
@Resource
private IResourceService iResourceService;

    @Override
    public User findByName(String userName) {
        return userMapper.findByName(userName);
    }

    @Override
    public UserDetail getUserDetail(String userId) {
        UserDetail userDetail=    userMapper.getUserDetail(userId);
         String roleId=  userDetail.getRoleId();
         if (StringUtils.isNotEmpty(roleId)){
           userDetail.setResourceDetails(iResourceService.findByRoleId(roleId));
         }
        return userDetail;
    }
}
