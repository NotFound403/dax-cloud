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
@TableName("teacher")
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = -417517008015710545L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String passwd;
    private String timer;
    private Long parkId;
    /**   1  删除 0 正常*/
    private Long status;
    // 关联幼儿园的链接
    private String cardId;
    // 个性头像
    private String img;
    // 性别
    private Long sex;
    // 生日
    private String birth;
    // 个性签名
    private String info;
    private Long age;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name +
                ", phone:" + phone +
                ", passwd:" + passwd +
                ", timer:" + timer +
                ", parkId:" + parkId +
                ", status:" + status +
                ", cardId:" + cardId +
                ", img:" + img +
                ", sex:" + sex +
                ", birth:" + birth +
                ", info:" + info +
                ", age:" + age +
                ", email:" + email +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
