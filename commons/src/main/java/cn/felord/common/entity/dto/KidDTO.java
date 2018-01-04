package cn.felord.common.entity.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 儿童信息dto.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 11:22
 */
public class KidDTO implements Serializable {

    private static final Long serialVersionUID = 5050131518530694033L;
    private Long parkClassId;
    private String childName;
    private String userName;
    private Long parentId;
    private Long age;
    private String sex;
    private Date birth;
    private String loveInfo;
    private Long status;
    private Long offDate;
    private String img;
    private Long parkId;
    private String parkName;

    public Long getParkClassId() {
        return parkClassId;
    }

    public void setParkClassId(Long parkClassId) {
        this.parkClassId = parkClassId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLoveInfo() {
        return loveInfo;
    }

    public void setLoveInfo(String loveInfo) {
        this.loveInfo = loveInfo;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getOffDate() {
        return offDate;
    }

    public void setOffDate(Long offDate) {
        this.offDate = offDate;
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

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return "{" +
                "parkClassId:" + parkClassId +
                ", childName:" + childName +
                ", userName:" + userName +
                ", parentId:" + parentId +
                ", age:" + age +
                ", sex:" + sex +
                ", birth:" + birth +
                ", loveInfo:" + loveInfo +
                ", status:" + status +
                ", offDate:" + offDate +
                ", img:" + img +
                ", parkId:" + parkId +
                ", parkName:" + parkName +
                '}';
    }
}
