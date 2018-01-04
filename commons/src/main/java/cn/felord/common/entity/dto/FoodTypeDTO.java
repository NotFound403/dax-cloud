package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/12 14:47
 */

public class FoodTypeDTO implements Serializable {
    private static final long serialVersionUID = 7331932313146923835L;
    private String foodId;
    private String foodName;
    private Long parkId;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    @Override
    public String toString() {
        return "{" +
                "foodId:" + foodId +
                ", foodName:" + foodName +
                ", parkId:" + parkId +
                '}';
    }
}
