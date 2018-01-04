package cn.felord.common.enums;

/**
 * The enum Password key enums.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/29 10:18
 */
public enum PasswordKeyEnums {

    /**
     * User password password key enums.
     */
    USER_PASSWORD("JafLOSyNIA12ADr3K", "user password  secretKey");

    private String key;
    private String description;


    PasswordKeyEnums(String key, String description) {
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
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(String key) {
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
