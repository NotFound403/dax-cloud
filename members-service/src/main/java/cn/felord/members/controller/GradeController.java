package cn.felord.members.controller;

import cn.felord.common.entity.Grade;
import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.StatusEnums;
import cn.felord.members.service.IGradeService;
import com.xiaoleilu.hutool.date.DateUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 * 班级
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/22 13:36
 */
@RestController
@RequestMapping("/grade")
public class GradeController {
    @Resource
    private IGradeService iGradeService;

    /**
     * Add grade rest.
     *
     * @param parkId the park id
     * @param name   the name
     * @return the rest
     */
    @PostMapping("/add")
    public Rest addGrade(Long parkId, String name) {
        Grade g = iGradeService.checkRepeat(parkId, name);
        if (Objects.isNull(g)) {
            Grade grade = new Grade();

            grade.setParkId(parkId);
            grade.setTagName(name);
            grade.setTimer(DateUtil.format(new Date(), "yyyy-MM-dd"));
            grade.setStatus(StatusEnums.ENABLE.getKey());

            iGradeService.insert(grade);
            return Rest.ok("添加成功");
        }
        return Rest.ok("添加失败,班级已存在");
    }

    /**
     * Update status rest.
     *
     * @param parkId  the park id
     * @param gradeId the grade id
     * @param status  the status
     * @return the rest
     */
    @PostMapping("/update/status")
    public Rest updateStatus(Long parkId, Long gradeId, Long status) {
        if (StatusEnums.ENABLE.getKey() == status) {
            iGradeService.updateStatus(parkId, gradeId, StatusEnums.ENABLE);
        }

        if (StatusEnums.DISABLED.getKey() == status) {
            iGradeService.updateStatus(parkId, gradeId, StatusEnums.DISABLED);
        }
        return Rest.ok();
    }

    /**
     * Update name rest.
     *
     * @param parkId  the park id
     * @param gradeId the grade id
     * @param name    the name
     * @return the rest
     */
    @PostMapping("/update/name")
    public Rest updateName(Long parkId, Long gradeId, String name) {
        iGradeService.updateName(parkId, gradeId, name);
        return Rest.ok();
    }

    /**
     * Find by teacher set.
     *
     * @param teacherId the teacher id
     * @return the set
     */
    @PostMapping("/feign/findbyteacher")
    public Set<Grade> findByTeacher(Long teacherId){
        return iGradeService.findByTeacher(teacherId);
    }
}
