package cn.felord.members.controller;

import cn.felord.common.entity.Parent;
import cn.felord.members.service.IParentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Parent controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/7 16:15
 */
@RestController
@RequestMapping("/parent")
public class ParentController {
    @Resource
    private IParentService iParentService;

    /**
     * Select by id parent.
     *
     * @param parentId the parent id
     * @return the parent
     */
    @PostMapping("/feign/findbyid")
    public Parent selectById(@RequestParam Long parentId) {
        return iParentService.selectById(parentId);
    }
}
