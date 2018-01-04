package cn.felord.common.enums;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/22 15:32
 */

public enum StatusEnums {
    /**
     * Enable user enable enums.
     */
    ENABLE(0, "启用"),
    /**
     * Disabled user enable enums.
     */
    DISABLED(1, "停用");

    private long key;
    private String description;


    StatusEnums(long key, String description) {
        this.key = key;
        this.description = description;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public long getKey() {
        return key;
    }

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(long key) {
        this.key = key;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
