package cn.felord.members.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.Teacher;
import cn.felord.common.entity.dto.TeacherDTO;
import org.apache.ibatis.annotations.Param;

/**
 * The interface Yoyo teacher mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/1 11:08
 */
public interface TeacherMapper extends BaseMapper<Teacher> {


    /**
     * 通过一卡通卡号获取老师.
     *
     * @param cardId the card id
     * @return the yoyo teacher dto
     */
    TeacherDTO findByCardId(@Param("cardId") String cardId);

    /**
     * Update status integer.
     *
     * @param parkId    the park id
     * @param teacherId the teacher id
     * @param status    the status
     * @return the integer
     */
    Integer updateStatus(@Param("parkId") Long parkId, @Param("teacherId") Long teacherId, @Param("status") Long status);
}

