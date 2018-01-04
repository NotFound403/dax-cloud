package cn.felord.homework.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import cn.felord.common.entity.WorkDetail;
import cn.felord.common.entity.dto.WorkDetailDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Work detail mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/25 14:49
 */
public interface WorkDetailMapper extends BaseMapper<WorkDetail> {

    /**
     * 根据班级查询作业列表.
     *
     * @param pagination the pagination
     * @param gradeId    the grade id
     * @return the list
     */
    List<WorkDetailDTO> findPageByGradeId(Pagination pagination, @Param("gradeId") Long gradeId);
}
