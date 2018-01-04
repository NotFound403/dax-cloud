package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 13:41
 */
@TableName("yoyopark")
public class YoyoPark extends Model<YoyoPark> {


    private static final Long serialVersionUID = -2316737198742989465L;

    @TableId(type = IdType.AUTO)
    //院所的Id
    private Long id;
    //院所的名字
    private String username;
    private String address;
    private String phone;
    //密码
    private String password;
    //园长名称
    private String president;
    private String instr;
    //代理商id
    private Long agentId;
    //注册时间
    private String timer;
    private Long status;
    private Long areaId;
    private String parkName;
    private String logo;
    private Long viewPay;
    private String bankcard;
    private String themId;
    private String vedioIp;
    //幼儿园地址
    private String location;
    private Double money;
    //幼儿园企业邮箱
    private String email;
    //幼儿园性质
    private String parkNature;
    //幼儿园总人数
    private Long num;
    //经度
    private Double Longitude;
    //纬度
    private Double latitude;
    //百度地图
    private Long zoom;


    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets president.
     *
     * @return the president
     */
    public String getPresident() {
        return president;
    }

    /**
     * Sets president.
     *
     * @param president the president
     */
    public void setPresident(String president) {
        this.president = president;
    }

    /**
     * Gets instr.
     *
     * @return the instr
     */
    public String getInstr() {
        return instr;
    }

    /**
     * Sets instr.
     *
     * @param instr the instr
     */
    public void setInstr(String instr) {
        this.instr = instr;
    }

    /**
     * Gets agent id.
     *
     * @return the agent id
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * Sets agent id.
     *
     * @param agentId the agent id
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Gets timer.
     *
     * @return the timer
     */
    public String getTimer() {
        return timer;
    }

    /**
     * Sets timer.
     *
     * @param timer the timer
     */
    public void setTimer(String timer) {
        this.timer = timer;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * Gets area id.
     *
     * @return the area id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * Sets area id.
     *
     * @param areaId the area id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * Gets park name.
     *
     * @return the park name
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * Sets park name.
     *
     * @param parkName the park name
     */
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * Gets view pay.
     *
     * @return the view pay
     */
    public Long getViewPay() {
        return viewPay;
    }

    /**
     * Sets view pay.
     *
     * @param viewPay the view pay
     */
    public void setViewPay(Long viewPay) {
        this.viewPay = viewPay;
    }

    /**
     * Gets bankcard.
     *
     * @return the bankcard
     */
    public String getBankcard() {
        return bankcard;
    }

    /**
     * Sets bankcard.
     *
     * @param bankcard the bankcard
     */
    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    /**
     * Gets them id.
     *
     * @return the them id
     */
    public String getThemId() {
        return themId;
    }

    /**
     * Sets them id.
     *
     * @param themId the them id
     */
    public void setThemId(String themId) {
        this.themId = themId;
    }

    /**
     * Gets vedio ip.
     *
     * @return the vedio ip
     */
    public String getVedioIp() {
        return vedioIp;
    }

    /**
     * Sets vedio ip.
     *
     * @param vedioIp the vedio ip
     */
    public void setVedioIp(String vedioIp) {
        this.vedioIp = vedioIp;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets money.
     *
     * @return the money
     */
    public Double getMoney() {
        return money;
    }

    /**
     * Sets money.
     *
     * @param money the money
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets park nature.
     *
     * @return the park nature
     */
    public String getParkNature() {
        return parkNature;
    }

    /**
     * Sets park nature.
     *
     * @param parkNature the park nature
     */
    public void setParkNature(String parkNature) {
        this.parkNature = parkNature;
    }

    /**
     * Gets num.
     *
     * @return the num
     */
    public Long getNum() {
        return num;
    }

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * Gets Longitude.
     *
     * @return the Longitude
     */
    public Double getLongitude() {
        return Longitude;
    }

    /**
     * Sets Longitude.
     *
     * @param Longitude the Longitude
     */
    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets zoom.
     *
     * @return the zoom
     */
    public Long getZoom() {
        return zoom;
    }

    /**
     * Sets zoom.
     *
     * @param zoom the zoom
     */
    public void setZoom(Long zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", username:" + username +
                ", address:" + address +
                ", phone:" + phone +
                ", president:" + president +
                ", instr:" + instr +
                ", agentId:" + agentId +
                ", timer:" + timer +
                ", status:" + status +
                ", areaId:" + areaId +
                ", parkName:" + parkName +
                ", logo:" + logo +
                ", viewPay:" + viewPay +
                ", themId:" + themId +
                ", location:" + location +
                ", email:" + email +
                ", parkNature:" + parkNature +
                ", num:" + num +
                ", Longitude:" + Longitude +
                ", latitude:" + latitude +
                ", zoom:" + zoom +
                '}';
    }


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
