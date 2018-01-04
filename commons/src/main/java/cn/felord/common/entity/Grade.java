package cn.felord.common.entity;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 班级
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 13:54
 */
@TableName("grade")
public class Grade extends Model<Grade> {

    private static final Long serialVersionUID = 4937031960823801496L;
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 班级名称
     */
    private String tagName;
    /**
     * 所属幼儿园
     */
    private Long parkId;
    /**
     * 添加时间
     */
    private String timer;
    /**
     * 0 可用 1 停用
     */
    private Long status;


    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets tag name.
     *
     * @return the tag name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets tag name.
     *
     * @param tagName the tag name
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Gets park id.
     *
     * @return the park id
     */
    public Long getParkId() {
        return parkId;
    }

    /**
     * Sets park id.
     *
     * @param parkId the park id
     */
    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }


    /**
     * Gets timer.
     *
     * @return the timer
     */
    public String getTimer() {
        return timer;
    }

    /**
     * Sets timer.
     *
     * @param timer the timer
     */
    public void setTimer(String timer) {
        this.timer = timer;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", tagName:" + tagName +
                ", parkId:" + parkId +
                ", timer:" + timer +
                ", status:" + status +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
