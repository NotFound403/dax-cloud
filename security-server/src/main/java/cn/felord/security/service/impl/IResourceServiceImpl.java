package cn.felord.security.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.securityserver.Resource;
import cn.felord.common.entity.securityserver.dto.ResourceDetail;
import cn.felord.security.mapper.ResourceMapper;
import cn.felord.security.service.IResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type Resource service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 17:16
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {
    @javax.annotation.Resource
    private ResourceMapper resourceMapper;

    @Override
    public List<ResourceDetail> findByRoleId(String roleId) {
        return resourceMapper.findByRoleId(roleId);
    }
}
