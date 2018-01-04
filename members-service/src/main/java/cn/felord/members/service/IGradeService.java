package cn.felord.members.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.Grade;
import cn.felord.common.enums.StatusEnums;

import java.util.Set;

/**
 * The interface Grade service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 11:47
 */
public interface IGradeService extends IService<Grade> {

    /**
     * 同一幼儿园不能出现同名的可用班级 避免混乱.
     *
     * @param parkId the park id
     * @param name   the name
     * @return the grade
     */
    Grade checkRepeat(Long parkId, String name);

    /**
     * Update status integer.
     *
     * @param parkId      the park id
     * @param gradeId     the grade id
     * @param statusEnums the status enums
     * @return the integer
     */
    Integer updateStatus(Long parkId, Long gradeId, StatusEnums statusEnums);

    /**
     * Update name integer.
     *
     * @param parkId  the park id
     * @param gradeId the grade id
     * @param name    the name
     * @return the integer
     */
    Integer updateName(Long parkId, Long gradeId, String name);

    /**
     * 查询老师管理的班级.
     *
     * @param teacherId the teacher id
     * @return the set
     */
    Set<Grade> findByTeacher(Long teacherId);
}
