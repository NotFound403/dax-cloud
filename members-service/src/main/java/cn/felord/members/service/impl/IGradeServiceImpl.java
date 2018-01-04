package cn.felord.members.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.Grade;
import cn.felord.common.enums.StatusEnums;
import cn.felord.members.mapper.GradeMapper;
import cn.felord.members.service.IGradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Set;

/**
 * The type Grade service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 11:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IGradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements IGradeService {
    @Resource
    private GradeMapper gradeMapper;

    @Override
    public Grade checkRepeat(Long parkId, String name) {
        return gradeMapper.checkRepeat(parkId, name);
    }

    @Override
    public Integer updateStatus(Long parkId, Long gradeId, StatusEnums statusEnums) {
        return gradeMapper.updateStatus(parkId, gradeId, statusEnums.getKey());
    }

    @Override
    public Integer updateName(Long parkId, Long gradeId, String name) {
        return gradeMapper.updateName(parkId, gradeId, name);
    }

    @Override
    public Set<Grade> findByTeacher(Long teacherId) {
        return gradeMapper.findByTeacher(teacherId);
    }
}
