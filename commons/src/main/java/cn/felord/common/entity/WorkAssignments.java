package cn.felord.common.entity;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 15:47
 */
@TableName("workassignments")
public class WorkAssignments extends Model<WorkAssignments> {

    private static final long serialVersionUID = -4124975638503088556L;
    @TableId(type = IdType.UUID)
    private String assignmentsId;
    private Long kidId;
    private String level;
    private String createTime;
    private String updateTime;


    public String getAssignmentsId() {
        return assignmentsId;
    }

    public void setAssignmentsId(String assignmentsId) {
        this.assignmentsId = assignmentsId;
    }

    public Long getKidId() {
        return kidId;
    }

    public void setKidId(Long kidId) {
        this.kidId = kidId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return assignmentsId;
    }

    @Override
    public String toString() {
        return "{" +
                "assignmentsId:" + assignmentsId +
                ", kidId:" + kidId +
                ", level:" + level +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                '}';
    }
}
