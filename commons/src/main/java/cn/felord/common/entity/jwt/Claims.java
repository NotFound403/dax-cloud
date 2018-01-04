package cn.felord.common.entity.jwt;


import cn.felord.common.enums.JwtTypeEnums;

import java.io.Serializable;
import java.util.UUID;


/**
 * The type Claims.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/23 14:00
 */
public class Claims implements Serializable {
    private static final long serialVersionUID = 6306466894173705434L;
    private static final String DEFAULT_ISS = "rerun";

    /**
     * 签发机构
     */
    private String iss = DEFAULT_ISS;
    /**
     * userId
     */
    private String aud;

    /**
     * 是否可用
     */
    private boolean available;
    /**
     * 过期时间   0  不过期
     */
    private long expired;
    /**
     * 签发时间
     */
    private long iat = System.currentTimeMillis();
    /**
     * 随机标识
     */
    private String random = UUID.randomUUID().toString();
    /**
     * 领域   app   admin 区分不同的用户
     *
     * @see JwtTypeEnums
     */
    private String domain;

    /**
     * Instantiates a new Claims.
     */
    public Claims() {
    }

    /**
     * Instantiates a new Claims.
     *
     * @param aud          the aud
     * @param available    the available
     * @param expired      the expired
     * @param jwtTypeEnums the jwt type enums
     */
    public Claims(String aud, boolean available, long expired, JwtTypeEnums jwtTypeEnums) {
        this.aud = aud;
        this.available = available;
        this.expired = expired;
        this.domain = jwtTypeEnums.getType();
    }

    /**
     * Instantiates a new Claims.
     *
     * @param aud          the aud
     * @param available    the available
     * @param jwtTypeEnums the jwt type enums
     */
    public Claims(String aud, boolean available, JwtTypeEnums jwtTypeEnums) {
        this.aud = aud;
        this.available = available;
        this.domain = jwtTypeEnums.getType();
    }

    /**
     * Gets iss.
     *
     * @return the iss
     */
    public String getIss() {
        return iss;
    }

    /**
     * Sets iss.
     *
     * @param iss the iss
     */
    public void setIss(String iss) {
        this.iss = iss;
    }

    /**
     * Gets aud.
     *
     * @return the aud
     */
    public String getAud() {
        return aud;
    }

    /**
     * Sets aud.
     *
     * @param aud the aud
     */
    public void setAud(String aud) {
        this.aud = aud;
    }

    /**
     * Is available boolean.
     *
     * @return the boolean
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets available.
     *
     * @param available the available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Gets expired.
     *
     * @return the expired
     */
    public long getExpired() {
        return expired;
    }

    /**
     * Sets expired.
     *
     * @param expired the expired
     */
    public void setExpired(long expired) {
        this.expired = expired;
    }

    /**
     * Gets iat.
     *
     * @return the iat
     */
    public long getIat() {
        return iat;
    }

    /**
     * Sets iat.
     *
     * @param iat the iat
     */
    public void setIat(long iat) {
        this.iat = iat;
    }

    /**
     * Gets random.
     *
     * @return the random
     */
    public String getRandom() {
        return random;
    }

    /**
     * Sets random.
     *
     * @param random the random
     */
    public void setRandom(String random) {
        this.random = random;
    }

    /**
     * Gets domain.
     *
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets domain.
     *
     * @param domain the domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "{" +
                "iss:" + iss +
                ", aud:" + aud +
                ", available:" + available +
                ", expired:" + expired +
                ", iat:" + iat +
                ", random:" + random +
                ", domain:" + domain +
                '}';
    }
}
