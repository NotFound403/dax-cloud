package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 13:54
 */
@TableName("parent")
public class Parent extends Model<Parent> {

    private static final long serialVersionUID = 2975765697620628709L;
    //家长的Id
    @TableId(type = IdType.AUTO)
    private Long id;
    //家长的用户名
    private String parentName;
    //家长的密码
    private String parentPass;
    //家长的电话号码
    private String phone;
    //家长的地址
    private String address;
    //家长的余额
    private Double balance;
    //注册时间
    private String timer;
    private Integer status;
    /** 默认的班级的id */
    private Integer defClassTag;
    /**
     * 家长身份
     */
    private String relation;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentPass() {
        return parentPass;
    }

    public void setParentPass(String parentPass) {
        this.parentPass = parentPass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDefClassTag() {
        return defClassTag;
    }

    public void setDefClassTag(Integer defClassTag) {
        this.defClassTag = defClassTag;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }


    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", parentName:" + parentName +
                ", phone:" + phone +
                ", address:" + address +
                ", balance:" + balance +
                ", timer:" + timer +
                ", status:" + status +
                ", defClassTag:" + defClassTag +
                ", relation:" + relation +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
