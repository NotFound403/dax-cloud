package cn.felord.members.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.Teacher;
import cn.felord.common.entity.dto.TeacherDTO;
import cn.felord.common.enums.StatusEnums;
import cn.felord.feign.api.checkinservice.CardService;
import cn.felord.members.mapper.TeacherMapper;
import cn.felord.members.service.ITeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * The type Yoyo teacher service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/1 11:18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ITeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private CardService cardService;

    @Override
    public TeacherDTO findByCardId(String cardId) {
        return teacherMapper.findByCardId(cardId);
    }

    @Override
    public Integer updateStatus(Long parkId, Long teacherId, StatusEnums statusEnums) {
        Teacher teacher = teacherMapper.selectById(teacherId);
        //停用对应一卡通
        if (Objects.nonNull(teacher)){
            String cardId = teacher.getCardId();
            cardService.updateStatus(cardId, statusEnums.getKey());
        }

        return teacherMapper.updateStatus(parkId, teacherId, statusEnums.getKey());
    }
}
