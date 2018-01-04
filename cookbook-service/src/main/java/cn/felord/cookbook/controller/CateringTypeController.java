package cn.felord.cookbook.controller;

import cn.felord.common.entity.system.Rest;
import cn.felord.cookbook.service.ICateringTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * The type Catering type controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:58
 */
@RestController
@RequestMapping("/cateringtype")
public class CateringTypeController {
    @Resource
    private ICateringTypeService iCateringTypeService;

    /**
     * Gets type.
     *
     * @param parkId the park id
     * @return the type
     */
    @GetMapping("/types")
    public Rest getType(Long parkId) {
        List<String> types=iCateringTypeService.findByParkId(parkId);
        return Rest.okData(types);
    }

}
