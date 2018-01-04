package cn.felord.homework.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.WorkDetail;
import cn.felord.common.entity.dto.WorkDetailDTO;
import cn.felord.homework.mapper.WorkDetailMapper;
import cn.felord.homework.service.IWorkDetailService;
import com.xiaoleilu.hutool.date.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * The type Work detail service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/25 15:00
 */
@Service
public class IWorkDetailServiceImpl extends ServiceImpl<WorkDetailMapper, WorkDetail> implements IWorkDetailService {
    @Resource
    private WorkDetailMapper workDetailMapper;

    @Override
    public Page<WorkDetailDTO> findPageByGradeId(Page<WorkDetailDTO> page, Long gradeId) {
        List<WorkDetailDTO> workDetailDTOS = workDetailMapper.findPageByGradeId(page, gradeId);
        page.setRecords(workDetailDTOS);
        return page;
    }

    @Override
    public boolean addWorkDetail(WorkDetailDTO workDetailDTO) {

        String title = workDetailDTO.getTitle();
        String content = workDetailDTO.getContent();
        Long gradeId = workDetailDTO.getGradeId();
        String workTime = workDetailDTO.getWorkTime();
        String publisher = workDetailDTO.getPublisher();

        WorkDetail workDetail = new WorkDetail();

        workDetail.setTitle(title);
        workDetail.setContent(content);
        workDetail.setGradeId(gradeId);
        workDetail.setWorkTime(workTime);
        workDetail.setPublisher(publisher);
        workDetail.setCreateTime(DateUtil.format(new Date(), "yyyy-MM-dd"));

        return this.insert(workDetail);
    }

    @Override
    public boolean updateWorkDetail(String workDetailId, WorkDetailDTO workDetailDTO) {
        String title = workDetailDTO.getTitle();
        String content = workDetailDTO.getContent();
        Long gradeId = workDetailDTO.getGradeId();
        String workTime = workDetailDTO.getWorkTime();
        String publisher = workDetailDTO.getPublisher();

        WorkDetail workDetail = new WorkDetail();

        workDetail.setWorkDetailId(workDetailId);
        workDetail.setTitle(title);
        workDetail.setContent(content);
        workDetail.setGradeId(gradeId);
        workDetail.setWorkTime(workTime);
        workDetail.setPublisher(publisher);
        workDetail.setUpdateTime(DateUtil.format(new Date(), "yyyy-MM-dd"));
        EntityWrapper<WorkDetail> entityWrapper = new EntityWrapper<>();
        entityWrapper.where("workDetailId={0}", workDetailId);
        return this.update(workDetail, entityWrapper);
    }
}
