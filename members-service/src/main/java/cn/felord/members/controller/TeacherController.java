package cn.felord.members.controller;

import cn.felord.common.entity.Teacher;
import cn.felord.common.entity.dto.TeacherVo;
import cn.felord.common.entity.dto.TeacherDTO;
import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.PasswordKeyEnums;
import cn.felord.common.enums.StatusEnums;
import cn.felord.members.service.ITeacherService;
import com.xiaoleilu.hutool.date.DateUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * The type   teacher controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:15
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private ITeacherService iTeacherService;

    /**
     * Find by card id  teacher dto.
     *
     * @param cardId the card id
     * @return the  teacher dto
     */
    @PostMapping("/feign/findbycardid")
    public TeacherDTO findByCardId(@RequestParam String cardId) {
        return iTeacherService.findByCardId(cardId);
    }

    /**
     * Add teacher rest.
     *
     * @param teacherVo the teacher vo
     * @return the rest
     */
    @PostMapping("/add")
    public Rest addTeacher(TeacherVo teacherVo) {
        String name = teacherVo.getName();
        String phone = teacherVo.getPhone();
        Long parkId = teacherVo.getParkId();
        String cardId = teacherVo.getCardId();
        Long sex = teacherVo.getSex();
        String birth = teacherVo.getBirth();
        Long age = teacherVo.getAge();
        String email = teacherVo.getEmail();
        String rawPassword = teacherVo.getPasswd();
//        密码加密
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder(PasswordKeyEnums.USER_PASSWORD.getKey());
        String encodedPassword = passwordEncoder.encode(rawPassword);

        Teacher teacher = new Teacher();

        teacher.setName(name);
        teacher.setAge(age);
        teacher.setPhone(phone);
        teacher.setParkId(parkId);
        teacher.setCardId(cardId);
        teacher.setPasswd(encodedPassword);
        teacher.setSex(sex);
        teacher.setBirth(birth);
        teacher.setEmail(email);
        teacher.setStatus(StatusEnums.ENABLE.getKey());
        teacher.setTimer(DateUtil.format(new Date(), "yyyy-MM-dd"));

        iTeacherService.insert(teacher);

        return Rest.ok("添加成功");

    }

    /**
     * Update status rest.
     *
     * @param parkId    the park id
     * @param teacherId the teacher id
     * @param status    the status
     * @return the rest
     */
    @PostMapping("/update/status")
    public Rest updateStatus(Long parkId, Long teacherId, Long status) {
        if (StatusEnums.ENABLE.getKey() == status) {
            iTeacherService.updateStatus(parkId, teacherId, StatusEnums.ENABLE);

        }

        if (StatusEnums.DISABLED.getKey() == status) {
            iTeacherService.updateStatus(parkId, teacherId, StatusEnums.DISABLED);
        }

        return Rest.ok();
    }
}
