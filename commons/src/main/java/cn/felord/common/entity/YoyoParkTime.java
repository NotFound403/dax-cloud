package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/1 9:59
 */
@TableName("yoyoparktime")
public class YoyoParkTime extends Model<YoyoParkTime> {


    private static final long serialVersionUID = -4505714200618468214L;
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 早上开始打卡时间
     */
    private String mBegin;
    /**
     * 早上打卡结束时间
     */
    private String mEnd;
    /**
     * 下午打卡时间
     */
    private String eBegin;
    /**
     * 下午打卡结束时间
     */
    private String eEnd;
    /**
     * 幼儿园的id
     */
    private Long parkId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmBegin() {
        return mBegin;
    }

    public void setmBegin(String mBegin) {
        this.mBegin = mBegin;
    }

    public String getmEnd() {
        return mEnd;
    }

    public void setmEnd(String mEnd) {
        this.mEnd = mEnd;
    }

    public String geteBegin() {
        return eBegin;
    }

    public void seteBegin(String eBegin) {
        this.eBegin = eBegin;
    }

    public String geteEnd() {
        return eEnd;
    }

    public void seteEnd(String eEnd) {
        this.eEnd = eEnd;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }


    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", mBegin:" + mBegin +
                ", mEnd:" + mEnd +
                ", eBegin:" + eBegin +
                ", eEnd:" + eEnd +
                ", parkId:" + parkId +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
