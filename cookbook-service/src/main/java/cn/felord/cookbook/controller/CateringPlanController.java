package cn.felord.cookbook.controller;

import cn.felord.common.entity.dto.CateringPlanDTO;
import cn.felord.common.entity.system.Rest;
import cn.felord.cookbook.service.ICateringPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * The type Catering plan controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 14:38
 */
@Api(value = "/cateringplan", description = "餐饮计划")
@RestController
@RequestMapping("/cateringplan")
public class CateringPlanController {
    @Resource
    private ICateringPlanService iCateringPlanService;


    /**
     * Add rest.
     *
     * @param cateringPlanDTO the catering plan dto
     * @param multipartFiles  the multipart files
     * @return the rest
     */
    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Rest add(@ModelAttribute CateringPlanDTO cateringPlanDTO, MultipartFile[] multipartFiles) {

        return iCateringPlanService.addPlan(cateringPlanDTO, multipartFiles);
    }


    /**
     * 获取某一天的食谱.
     *
     * @param parkId the park id
     * @param period the period
     * @return the rest
     */
    @ApiOperation(value = "获取某一天的食谱")
    @PostMapping("/getdayplan")
    public Rest getPlanByPeriod(@RequestParam @ApiParam(value = "幼儿园id", required = true) Long parkId, @RequestParam @ApiParam(value = "执行日期", required = true) String period) {
        return iCateringPlanService.getPlanByPeriod(parkId, period);
    }


    /**
     * Update rest.
     *
     * @param cateringPlanDTO the catering plan dto
     * @return the rest
     */
    @ApiOperation(value = "更新食谱")
    @PostMapping("/update")
    public Rest update(@ModelAttribute CateringPlanDTO cateringPlanDTO, MultipartFile[] multipartFiles) {
        return iCateringPlanService.updatePlan(cateringPlanDTO, multipartFiles);
    }

    /**
     * 删除某一天的食谱.
     *
     * @param planId the plan id
     * @return the rest
     */
    @ApiOperation(value = "删除某一天的食谱")
    @PostMapping("/delete/{planId}")
    public Rest delete(@PathVariable("planId") @ApiParam(value = "计划id", required = true) String planId) {
        boolean flag = iCateringPlanService.deleteById(planId);
        String msg = flag ? "删除成功" : "删除失败";
        return Rest.ok(msg);
    }

}
