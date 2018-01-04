package cn.felord.members.controller;

import cn.felord.common.entity.dto.KidDTO;
import cn.felord.members.service.IKidService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Park class controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:15
 */
@RestController
@RequestMapping("/kid")
public class KidController {
    @Resource
    private IKidService iKidService;

    /**
     * Find by kid id kid dto.
     *
     * @param kidId the kid id
     * @return the kid dto
     */
    @PostMapping("/feign/findbyid")
    public KidDTO findByKidId(@RequestParam Long kidId) {
        return iKidService.findByKidId(kidId);
    }
}
