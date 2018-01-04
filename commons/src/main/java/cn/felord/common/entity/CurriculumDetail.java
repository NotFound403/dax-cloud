package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * 课程表详情
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 13:54
 */
@TableName("curriculumdetail")
public class CurriculumDetail extends Model<CurriculumDetail> {

    private static final long serialVersionUID = 5126321168471356576L;
    @TableId(type = IdType.UUID)
    private String curriculumId;
    private String gradeId;
    private String teacherName;
    private String courseName;
    private String weekDay;
    private String courseTime;
    private String createTime;
    private String updateTime;


    /**
     * Gets curriculum id.
     *
     * @return the curriculum id
     */
    public String getCurriculumId() {
        return curriculumId;
    }

    /**
     * Sets curriculum id.
     *
     * @param curriculumId the curriculum id
     */
    public void setCurriculumId(String curriculumId) {
        this.curriculumId = curriculumId;
    }

    /**
     * Gets grade id.
     *
     * @return the grade id
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * Sets grade id.
     *
     * @param gradeId the grade id
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * Gets teacher name.
     *
     * @return the teacher name
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * Sets teacher name.
     *
     * @param teacherName the teacher name
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * Gets course name.
     *
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets course name.
     *
     * @param courseName the course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets week day.
     *
     * @return the week day
     */
    public String getWeekDay() {
        return weekDay;
    }

    /**
     * Sets week day.
     *
     * @param weekDay the week day
     */
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    /**
     * Gets course time.
     *
     * @return the course time
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * Sets course time.
     *
     * @param courseTime the course time
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return curriculumId;
    }

    @Override
    public String toString() {
        return "{" +
                "curriculumId:" + curriculumId +
                ", gradeId:" + gradeId +
                ", teacherName:" + teacherName +
                ", courseName:" + courseName +
                ", weekDay:" + weekDay +
                ", courseTime:" + courseTime +
                ", createTime:" + createTime +
                ", updateTime:" + updateTime +
                '}';
    }
}
