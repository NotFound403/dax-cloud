package cn.felord.cookbook.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.CateringPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Catering plan mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:43
 */
public interface CateringPlanMapper extends BaseMapper<CateringPlan> {
    /**
     * 查询某一天的食谱.
     *
     * @param parkId the park id
     * @param period the period   yyyy-MM-dd
     * @return the list
     */
    List<CateringPlan> findByPeriod(@Param("parkId") Long parkId, @Param("period") String period);

    /**
     * 重复检查.
     *
     * @param parkId       the park id
     * @param cateringType the catering type
     * @param period       the period
     * @return the catering plan
     */
    CateringPlan checkPlan(@Param("parkId") Long parkId, @Param("cateringType") String cateringType, @Param("period") String period);

    /**
     * 修改图片路径.
     *
     * @param planId the plan id
     * @param img    the img
     */
    void updateImagePaths(@Param("planId") String planId, @Param("img") String img);
}
