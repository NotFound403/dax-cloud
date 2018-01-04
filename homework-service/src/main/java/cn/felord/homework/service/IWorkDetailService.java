package cn.felord.homework.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.WorkDetail;
import cn.felord.common.entity.dto.WorkDetailDTO;

/**
 * The interface Work detail service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/25 14:56
 */
public interface IWorkDetailService extends IService<WorkDetail> {


    /**
     * Find by grade id list.
     *
     * @param page    the page
     * @param gradeId the grade id
     * @return the list
     */
    Page<WorkDetailDTO> findPageByGradeId(Page<WorkDetailDTO> page, Long gradeId);

    /**
     * Add boolean.
     *
     * @param workDetailDTO the work detail dto
     * @return the boolean
     */
    boolean addWorkDetail(WorkDetailDTO workDetailDTO);

    /**
     * Update work detail boolean.
     *
     * @param workDetailId  the work detail id
     * @param workDetailDTO the work detail dto
     * @return the boolean
     */
    boolean updateWorkDetail(String workDetailId,WorkDetailDTO workDetailDTO);
}
