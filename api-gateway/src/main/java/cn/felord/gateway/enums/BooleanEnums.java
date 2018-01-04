package cn.felord.gateway.enums;

/**
 * The enum Boolen enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 15:01
 */
public enum BooleanEnums {

    /**
     * True boolen enums.
     */
    TRUE("1", "true"),
    /**
     * False boolen enums.
     */
    FALSE("0", "false");

    private String key;
    private String description;

    BooleanEnums(String key, String description) {
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
