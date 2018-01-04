package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/1 11:32
 */

public class CardDTO implements Serializable {

    private static final long serialVersionUID = 876336030896217711L;

    private Long id;
    private Long parkId;
    private String cardId;
    /**
     * 0是宝宝1是老师
     */
    private Integer typeId;
    /**
     * 附加信息
     */
    private String info;
    private String timer;
    /**
     * parkClassId
     */
    private Long uid;
    private String uname;
    /**
     * todo  0
     */
    private Long status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", parkId:" + parkId +
                ", cardId:" + cardId +
                ", typeId:" + typeId +
                ", info:" + info +
                ", timer:" + timer +
                ", uid:" + uid +
                ", uname:" + uname +
                ", status:" + status +
                '}';
    }
}
