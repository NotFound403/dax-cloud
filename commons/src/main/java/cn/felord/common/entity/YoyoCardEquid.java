package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 一卡通实体
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 14:53
 */
@TableName("yoyocardequid")
public class YoyoCardEquid extends Model<YoyoCardEquid> {

    private static final long serialVersionUID = -4089071502636726848L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String cardId;
    /** 0是宝宝1是老师  */
    private Integer typeId;
    /** 附加信息 */
    private String info;
    private String timer;
    /** kidId */
    private Integer uid;
    private String uname;
    /** 0 可用  2 锁定  */
    private Long status;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
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
    protected Serializable pkVal() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
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
