package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 作业
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 15:47
 */
@TableName("workdetail")
public class WorkDetail extends Model<WorkDetail> {

    private static final long serialVersionUID = -8731417794908985960L;
    @TableId(type = IdType.UUID)
    private String workDetailId;
    private String title;
    private String content;
    private Long gradeId;
    private String workTime;
    private String publisher;
    private String createTime;
    private String updateTime;


    public String getWorkDetailId() {
        return workDetailId;
    }

    public void setWorkDetailId(String workDetailId) {
        this.workDetailId = workDetailId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
        return workDetailId;
    }

    @Override
    public String toString() {
        return "{" +
                "workDetailId:" + workDetailId +
                ", title:" + title +
                ", content:" + content +
                ", gradeId:" + gradeId +
                ", workTime:" + workTime +
                ", publisher:" + publisher +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                '}';
    }
}
