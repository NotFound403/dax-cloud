package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/22 16:15
 */

public class TeacherVo implements Serializable {
    private static final long serialVersionUID = 2907315464705336300L;
    private String name;
    private String phone;
    private String passwd;
    private Long parkId;
    private String cardId;
    private Long sex;
    private String birth;
    private Long age;
    private String email;

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

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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
                "name:" + name +
                ", phone:" + phone +
                ", parkId:" + parkId +
                ", cardId:" + cardId +
                ", sex:" + sex +
                ", birth:" + birth +
                ", age:" + age +
                ", email:" + email +
                '}';
    }
}
