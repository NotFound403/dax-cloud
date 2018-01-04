package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/25 15:45
 */

public class WorkDetailDTO implements Serializable {

    private static final long serialVersionUID = -4073564870566500520L;
    private String title;
    private String content;
    private Long gradeId;
    private String workTime;
    private String publisher;

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

    @Override
    public String toString() {
        return "{" +
                "title:" + title +
                ", content:" + content +
                ", gradeId:" + gradeId +
                ", workTime:" + workTime +
                ", publisher:" + publisher +
                '}';
    }
}
