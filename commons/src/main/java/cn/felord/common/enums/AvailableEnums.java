package cn.felord.common.enums;

/**
 * The enum User enable enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 10:44
 */
public enum AvailableEnums {

    /**
     * Enable user enable enums.
     */
    ENABLE("1", "可用"),
    /**
     * Disabled user enable enums.
     */
    DISABLED("0","不可用");

    private String key;
    private String description;


    AvailableEnums(String key, String description) {
        this.key = key;
        this.description = description;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
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
