package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 打卡记录
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 15:25
 */
@TableName("yoyocardlog")
public class YoyoCardLog extends Model<YoyoCardLog> {

    private static final long serialVersionUID = 2534367174241225434L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String cardId;
    private Integer typeId;
    private String uname;
    private String phone;
    private String timer;
    private String img;
    private Long parkId;
    private Long uid;
    private String dater;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getDater() {
        return dater;
    }

    public void setDater(String dater) {
        this.dater = dater;
    }



    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", cardId:" + cardId +
                ", typeId:" + typeId +
                ", uname:" + uname +
                ", phone:" + phone +
                ", timer:" + timer +
                ", img:" + img +
                ", parkId:" + parkId +
                ", uid:" + uid +
                ", dater:" + dater +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
