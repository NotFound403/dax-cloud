package cn.felord.members.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * The interface Grade mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 11:43
 */
public interface GradeMapper extends BaseMapper<Grade> {

    /**
     * 同一幼儿园不能出现同名的可用班级 避免混乱.
     *
     * @param parkId the park id
     * @param name   the name
     * @return the grade
     */
    Grade checkRepeat(@Param("parkId") Long parkId, @Param("name") String name);

    /**
     * 启用停用.
     *
     * @param parkId  the park id
     * @param gradeId the grade id
     * @param status  the status
     * @return the integer
     * @see cn.felord.common.enums.StatusEnums
     */
    Integer  updateStatus(@Param("parkId") Long parkId, @Param("gradeId") Long gradeId, @Param("status") Long status);

    /**
     * Update name integer.
     *
     * @param parkId  the park id
     * @param gradeId the grade id
     * @param name    the name
     * @return the integer
     */
    Integer updateName(@Param("parkId") Long parkId, @Param("gradeId") Long gradeId, @Param("name") String name);

    /**
     * 查询老师管理的班级.
     *
     * @param teacherId the teacher id
     * @return the set
     */
    Set<Grade> findByTeacher(@Param("teacherId") Long teacherId);
}
