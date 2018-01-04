package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.Resource;
import cn.felord.common.entity.securityserver.dto.ResourceDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Resource mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 17:15
 */
public interface ResourceMapper extends BaseMapper<Resource> {

    /**
     * Find by role id list.
     *
     * @param roleId the role id
     * @return the list
     */
    List<ResourceDetail> findByRoleId(@Param("roleId") String roleId);
}
