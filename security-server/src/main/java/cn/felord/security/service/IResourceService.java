package cn.felord.security.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.securityserver.Resource;
import cn.felord.common.entity.securityserver.dto.ResourceDetail;

import java.util.List;

/**
 * The interface Resource service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 17:16
 */
public interface IResourceService extends IService<Resource> {
    /**
     * Find by role id list.
     *
     * @param roleId the role id
     * @return the list
     */
    List<ResourceDetail> findByRoleId(String roleId);
}
