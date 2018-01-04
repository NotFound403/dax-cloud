package cn.felord.cookbook.service;

import com.baomidou.mybatisplus.service.IService;
import cn.felord.common.entity.CateringPlan;
import cn.felord.common.entity.dto.CateringPlanDTO;
import cn.felord.common.entity.system.Rest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * The interface Catering plan service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:50
 */
public interface ICateringPlanService extends IService<CateringPlan> {
    /**
     * 查询某一天的食谱.
     *
     * @param parkId the park id
     * @param period the period   yyyy-MM-dd
     * @return the list
     */
    List<CateringPlan> findByPeriod(Long parkId, String period);

    /**
     * 重复检查.
     *
     * @param parkId       the park id
     * @param cateringType the catering type
     * @param period       the period
     * @return the list
     */
    CateringPlan checkPlan(Long parkId, String cateringType, String period);

    /**
     * 修改图片路径.
     *
     * @param planId the plan id
     * @param img    the img
     */
    void updateImagePaths(String planId, String img);

    /**
     * Add.
     *
     * @param cateringPlanDTO the catering plan dto
     * @param multipartFiles  the multipart files
     * @return the rest
     */
    Rest addPlan(CateringPlanDTO cateringPlanDTO, MultipartFile[] multipartFiles);

    /**
     * Gets plan by period.
     *
     * @param parkId the park id
     * @param period the period
     * @return the plan by period
     */
    Rest getPlanByPeriod(Long parkId, String period);

    /**
     * Update plan rest.
     *
     * @param cateringPlanDTO the catering plan dto
     * @param multipartFiles  the multipart files
     * @return the rest
     */
    Rest  updatePlan(CateringPlanDTO cateringPlanDTO,MultipartFile[] multipartFiles);
}
