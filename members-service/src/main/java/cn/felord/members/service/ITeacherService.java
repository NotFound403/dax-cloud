package cn.felord.members.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.Teacher;
import cn.felord.common.entity.dto.TeacherDTO;
import cn.felord.common.enums.StatusEnums;

/**
 * The interface Yoyo teacher service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/1 11:17
 */
public interface ITeacherService extends IService<Teacher> {
    /**
     * Find by card id yoyo teacher dto.
     *
     * @param cardId the card id
     * @return the yoyo teacher dto
     */
    TeacherDTO findByCardId(String cardId);

    /**
     * Instantiates a new Update status.
     *
     * @param parkId      the park id
     * @param teacherId   the teacher id
     * @param statusEnums the status enums
     * @return the integer
     */
    Integer updateStatus(Long parkId, Long teacherId, StatusEnums statusEnums);
}
