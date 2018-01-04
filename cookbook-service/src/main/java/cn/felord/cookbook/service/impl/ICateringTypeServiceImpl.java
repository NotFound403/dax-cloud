package cn.felord.cookbook.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.CateringType;
import cn.felord.cookbook.mapper.CateringTypeMapper;
import cn.felord.cookbook.service.ICateringTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * The type Catering type service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:52
 */
@Service
public class ICateringTypeServiceImpl extends ServiceImpl<CateringTypeMapper, CateringType> implements ICateringTypeService {
    @Resource
    private CateringTypeMapper cateringTypeMapper;

    @Override
    public List<String> findByParkId(Long parkId) {
        return cateringTypeMapper.findByParkId(parkId);
    }
}
