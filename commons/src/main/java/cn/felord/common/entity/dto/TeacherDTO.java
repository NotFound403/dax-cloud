package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/1 11:14
 */

public class TeacherDTO implements Serializable {
    private static final long serialVersionUID = 8634824583894893517L;

    private Long id;
    private String name;
    private String phone;
    private Long parkId;
    private String img;

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

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name +
                ", phone:" + phone +
                ", parkId:" + parkId +
                ", img:" + img +
                '}';
    }
}
