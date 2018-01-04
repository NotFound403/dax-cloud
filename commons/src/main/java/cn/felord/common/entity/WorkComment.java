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
@TableName("workcomment")
public class WorkComment extends Model<WorkComment> {

    private static final long serialVersionUID = 1090530994840522472L;
    @TableId(type = IdType.UUID)
    private String commentId;
    private String assignmentsId;
    private String teacher;
    private String content;
    private Integer starLevel;
    private String createTime;
    private String updateTime;


    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getAssignmentsId() {
        return assignmentsId;
    }

    public void setAssignmentsId(String assignmentsId) {
        this.assignmentsId = assignmentsId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
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
        return commentId;
    }

    @Override
    public String toString() {
        return "{" +
                "commentId:" + commentId +
                ", assignmentsId:" + assignmentsId +
                ", teacher:" + teacher +
                ", content:" + content +
                ", starLevel:" + starLevel +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                '}';
    }
}
