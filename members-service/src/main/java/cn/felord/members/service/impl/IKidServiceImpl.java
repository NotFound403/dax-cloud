package cn.felord.members.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.Kid;
import cn.felord.common.entity.dto.KidDTO;
import cn.felord.members.mapper.KidMapper;
import cn.felord.members.service.IKidService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Set;

/**
 * The type Park class service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 11:46
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IKidServiceImpl extends ServiceImpl<KidMapper, Kid> implements IKidService {
    @Resource
    private KidMapper kidMapper;

    @Override
    public Set<KidDTO> findByParentId(Long parentId) {
        return kidMapper.findByParentId(parentId);
    }

    @Override
    public KidDTO findByKidId(Long kidId) {
        return kidMapper.findByKidId(kidId);
    }
}
