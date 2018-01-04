package cn.felord.cookbook.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.CateringPlan;
import cn.felord.common.entity.dto.CateringPlanDTO;
import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.UploadPathEnums;
import cn.felord.cookbook.mapper.CateringPlanMapper;
import cn.felord.cookbook.service.ICateringPlanService;
import cn.felord.feign.api.uploadservice.UploadService;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.CollectionUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.*;

/**
 * The type Catering plan service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:51
 */
@Service
public class ICateringPlanServiceImpl extends ServiceImpl<CateringPlanMapper, CateringPlan> implements ICateringPlanService {
    @Resource
    private CateringPlanMapper cateringPlanMapper;
    @Resource
    private UploadService uploadService;

    @Override
    public List<CateringPlan> findByPeriod(Long parkId, String period) {
        return cateringPlanMapper.findByPeriod(parkId, period);
    }

    @Override
    public CateringPlan checkPlan(Long parkId, String cateringType, String period) {
        return cateringPlanMapper.checkPlan(parkId, cateringType, period);
    }

    @Override
    public void updateImagePaths(String planId, String img) {
        cateringPlanMapper.updateImagePaths(planId, img);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Rest addPlan(CateringPlanDTO cateringPlanDTO, MultipartFile[] multipartFiles) {
        Long parkId = cateringPlanDTO.getParkId();
        String period = cateringPlanDTO.getPeriod();
        String foodNames = cateringPlanDTO.getFoodNames();
        String cateringType = cateringPlanDTO.getCateringType();
        String[] imgs = getImages(multipartFiles);
        String description = cateringPlanDTO.getDescription();

        CateringPlan checkResult = this.checkPlan(parkId, cateringType, period);

        if (Objects.nonNull(checkResult)) {
            return Rest.ok("当日 '" + cateringType + "'已经添加,不能重复添加");
        }
        if (StringUtils.isEmpty(foodNames)) {
            return Rest.ok("菜单不能为空");
        }
        if (StringUtils.isEmpty(cateringType)) {
            return Rest.ok("用餐类型不能为空");
        }
        if (StringUtils.isEmpty(period)) {
            return Rest.ok("时间不能为空");
        }
        CateringPlan plan = new CateringPlan();

        plan.setParkId(parkId);
        plan.setFoodNames(foodNames);
        plan.setCateringType(cateringType);
        plan.setPeriod(period);
        if (imgs != null && CollectionUtil.isNotEmpty(Arrays.asList(imgs))) {
            plan.setImg(StringUtils.join(imgs, ","));
        }

        plan.setDescription(description);
        plan.setCreateTime(DateUtil.format(new Date(), "yyyy-MM-dd"));

        this.insert(plan);

        if (multipartFiles != null && multipartFiles.length > 0) {
            uploadService.multipartUpload(multipartFiles, UploadPathEnums.FOOD);
        }

        return Rest.ok();
    }

    @Override
    public Rest getPlanByPeriod(Long parkId, String period) {
        List<CateringPlan> cateringPlans = this.findByPeriod(parkId, period);

        Map<String, CateringPlanDTO> map = new HashMap<>(5);


        if (CollectionUtil.isNotEmpty(cateringPlans)) {
            for (CateringPlan cateringPlan : cateringPlans) {

                String planId = cateringPlan.getPlanId();
                String cateringType = cateringPlan.getCateringType();
                String foodNames = cateringPlan.getFoodNames();
                String img = cateringPlan.getImg();
                String description = cateringPlan.getDescription();

                CateringPlanDTO cateringPlanDTO = new CateringPlanDTO();

                cateringPlanDTO.setPlanId(planId);
                cateringPlanDTO.setParkId(parkId);
                cateringPlanDTO.setPeriod(period);
                cateringPlanDTO.setFoodNames(foodNames);
                if (StringUtils.isNotEmpty(img)) {
                    cateringPlanDTO.setImgs(img.split(","));
                }
                cateringPlanDTO.setDescription(description);
                cateringPlanDTO.setCateringType(cateringType);

                map.put(cateringType, cateringPlanDTO);
            }
        }
        return Rest.okData(map);
    }

    @Override
    public Rest updatePlan(CateringPlanDTO cateringPlanDTO, MultipartFile[] multipartFiles) {
        String planId = cateringPlanDTO.getPlanId();
        Long parkId = cateringPlanDTO.getParkId();
        String period = cateringPlanDTO.getPeriod();
        String foodNames = cateringPlanDTO.getFoodNames();
        String cateringType = cateringPlanDTO.getCateringType();
        String[] imgs = getImages(multipartFiles);
        String description = cateringPlanDTO.getDescription();

        CateringPlan plan = new CateringPlan();

        plan.setPlanId(planId);
        plan.setPeriod(period);
        plan.setParkId(parkId);
        plan.setFoodNames(foodNames);
        plan.setCateringType(cateringType);

        if (imgs != null && CollectionUtil.isNotEmpty(Arrays.asList(imgs))) {
            plan.setImg(StringUtils.join(imgs, ","));
        }else {
            plan.setImg(null);
        }

        plan.setDescription(description);
        plan.setUpdateTime(DateUtil.format(new Date(), "yyyy-MM-dd"));

        EntityWrapper<CateringPlan> entityWrapper=new EntityWrapper<>();
        entityWrapper.where("planId={0}",planId);

        if (multipartFiles != null && multipartFiles.length > 0) {
            uploadService.multipartUpload(multipartFiles, UploadPathEnums.FOOD);
        }
        boolean flag = this.update(plan,entityWrapper);
        String msg = flag ? "更新成功" : "更新失败";
        return Rest.ok(msg);
    }


    private String [] getImages(MultipartFile[] multipartFiles){
        String[] imgs = null;

        if (multipartFiles != null && multipartFiles.length > 0) {
            int l = multipartFiles.length;
            imgs = new String[l];
            for (int i = 0; i < l; i++) {
                imgs[i] = multipartFiles[i].getOriginalFilename();
            }
        }
        return imgs;
    }
}
