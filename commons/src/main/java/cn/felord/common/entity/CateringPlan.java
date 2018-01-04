package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 饮食计划
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 13:54
 */
@TableName("cateringplan")
public class CateringPlan extends Model<CateringPlan> {

    private static final long serialVersionUID = 5430196800029745989L;
    @TableId(type = IdType.UUID)
    private String planId;
    private Long parkId;
    private String foodNames;
    private String cateringType;
    private String period;
    private String img;
    private String description;
    private String createTime;
    private String updateTime;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Long getParkId() {
        return parkId;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return planId;
    }

    @Override
    public String toString() {
        return "{" +
                "planId:" + planId +
                ", parkId:" + parkId +
                ", foodNames:" + foodNames +
                ", cateringType:" + cateringType +
                ", period:" + period +
                ", img:" + img +
                ", description:" + description +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                '}';
    }
}
