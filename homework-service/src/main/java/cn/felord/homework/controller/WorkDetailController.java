package cn.felord.homework.controller;

import com.baomidou.mybatisplus.plugins.Page;
import cn.felord.common.entity.dto.WorkDetailDTO;
import cn.felord.common.entity.system.Rest;
import cn.felord.homework.service.IWorkDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 家庭作业.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/25 15:09
 */
@RestController
@RequestMapping("/workdetail")
public class WorkDetailController {
    @Resource
    private IWorkDetailService iWorkDetailService;

    /**
     * 添加作业.
     *
     * @param workDetailDTO the work detail dto
     * @return the rest
     */
    @PostMapping("/add")
    public Rest addWorkDetail(WorkDetailDTO workDetailDTO) {
        boolean flag = iWorkDetailService.addWorkDetail(workDetailDTO);
        return flag ? Rest.ok("添加成功") : Rest.ok("添加失败");
    }

    /**
     * 更新作业.
     *
     * @param workDetailId  the work detail id
     * @param workDetailDTO the work detail dto
     * @return the rest
     */
    @PostMapping("/update")
    public Rest updateWorkDetail(String workDetailId, WorkDetailDTO workDetailDTO) {
        boolean flag = iWorkDetailService.updateWorkDetail(workDetailId, workDetailDTO);
        return flag ? Rest.ok("更新成功") : Rest.ok("更新失败");
    }

    /**
     * Find by grade id rest.
     *
     * @param current the current
     * @param size    the size
     * @param gradeId the grade id
     * @return the rest
     */
    @PostMapping("/findbyid")
    public Rest findByGradeId(Integer current, Integer size, Long gradeId) {
        if (size == 0) {
            size = 15;
        }
        Page<WorkDetailDTO> workDetailDTOPage = new Page<>(current, size);

        return Rest.okData(iWorkDetailService.findPageByGradeId(workDetailDTOPage, gradeId));
    }
}
