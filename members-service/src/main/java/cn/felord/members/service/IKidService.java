package cn.felord.members.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.Kid;
import cn.felord.common.entity.dto.KidDTO;

import java.util.Set;

/**
 * The interface Park class service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 11:45
 */
public interface IKidService extends IService<Kid> {


    /**
     * Find by parent id kid dto.
     *
     * @param parentId the parent id
     * @return the kid dto
     */
    Set<KidDTO> findByParentId(Long parentId);

    /**
     * feign client .
     *
     * @param kidId the kid id
     * @return the kid dto
     */
    KidDTO findByKidId(Long kidId);
}
