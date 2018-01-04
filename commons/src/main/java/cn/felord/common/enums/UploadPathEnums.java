package cn.felord.common.enums;

/**
 * The enum Upload path enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 16:35
 */
public enum UploadPathEnums {

    /**
     * Circle upload path enums.
     */
    CIRCLE("/web/www/static/appCircle/", "朋友圈"),
    /**
     * Icon upload path enums.
     */
    ICON("/web/www/static/appIcon/", "图标"),
    /**
     * Card upload path enums.
     */
    CARD("/web/www/static/card/", "一卡通"),
    /**
     * Food upload path enums.
     */
    FOOD("/web/www/static/foodImg/", "食谱"),
    /**
     * Home work upload path enums.
     */
    HOME_WORK("/web/www/static/homework/", "家庭作业");


    private String path;

    private String description;

    UploadPathEnums(String path, String description) {
        this.path = path;
        this.description = description;
    }

    /**
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
