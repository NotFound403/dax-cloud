package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 13:41
 */
@TableName("kid")
public class Kid extends Model<Kid> {


    private static final Long serialVersionUID = 6170285016920385109L;
    //宝宝的Id
    @TableId(type = IdType.AUTO)
    private Long id;
    //院所的Id
    private Long parkId;
    //孩子的名字
    private String childName;
    //班级等级的Id
    private Long classTagLevel;
    //家长表的Id
    private Long parentId;
    //注册时间
    private String timer;
    //状态0为正常1位冻结
    private Long status;
    private String payDate;
    //余额
    private Long offDate;
    //年龄
    private Long age;
    //生日
    private Date birth;
    //性别
    private String sex;
    //爱的寄语
    private String loveInfo;
    private String img;
    private String cardId;
    private Long used;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Long getClassTagLevel() {
        return classTagLevel;
    }

    public void setClassTagLevel(Long classTagLevel) {
        this.classTagLevel = classTagLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public Long getOffDate() {
        return offDate;
    }

    public void setOffDate(Long offDate) {
        this.offDate = offDate;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoveInfo() {
        return loveInfo;
    }

    public void setLoveInfo(String loveInfo) {
        this.loveInfo = loveInfo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", parkId:" + parkId +
                ", childName:" + childName +
                ", classTagLevel:" + classTagLevel +
                ", parentId:" + parentId +
                ", timer:" + timer +
                ", status:" + status +
                ", payDate:" + payDate +
                ", offDate:" + offDate +
                ", age:" + age +
                ", birth:" + birth +
                ", sex:" + sex +
                ", loveInfo:" + loveInfo +
                ", img:" + img +
                ", cardId:" + cardId +
                ", used:" + used +
                '}';
    }
}
