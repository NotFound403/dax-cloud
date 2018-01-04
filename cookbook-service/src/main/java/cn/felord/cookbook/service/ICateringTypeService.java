package cn.felord.cookbook.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.CateringType;

import java.util.List;

/**
 * The interface Catering type service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:49
 */
public interface ICateringTypeService extends IService<CateringType> {
    /**
     * Find by park id list.
     *
     * @param parkId the park id
     * @return the list
     */
    List<String> findByParkId(Long parkId);
}
