package cn.felord.common.entity.dto;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/12 15:48
 */

public class CateringPlanDTO implements Serializable {
    private static final long serialVersionUID = -238567833943133663L;
    private String planId;
    private Long parkId;
    private String foodNames;
    private String cateringType;
    private String[] imgs;
    private String period;
    private String description;


    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Long getParkId() {
        return parkId;
    }

    @Override
    public String toString() {
        return "{" +
                "planId:" + planId +
                ", parkId:" + parkId +
                ", foodNames:" + foodNames +
                ", cateringType:" + cateringType +
                ", imgs:" + Arrays.toString(imgs) +
                ", period:" + period +
                ", description:" + description +
                '}';
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getFoodNames() {
        return foodNames;
    }

    public void setFoodNames(String foodNames) {
        this.foodNames = foodNames;
    }

    public String getCateringType() {
        return cateringType;
    }

    public void setCateringType(String cateringType) {
        this.cateringType = cateringType;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
