package cn.felord.common.enums;

/**
 * The enum Catering plan type enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 17:19
 */
public enum CateringPlanTypeEnums {
    /**
     * Kid catering plan type enums.
     */
    BREAKFAST("早餐"),
    /**
     * Reveille catering plan type enums.
     */
    REVEILLE("早点"),
    /**
     * Lunch catering plan type enums.
     */
    LUNCH("午餐"),
    /**
     * Snack catering plan type enums.
     */
    SNACK("午点"),
    /**
     * Supper catering plan type enums.
     */
    SUPPER("晚餐");


    private String type;

    CateringPlanTypeEnums(String type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
}
