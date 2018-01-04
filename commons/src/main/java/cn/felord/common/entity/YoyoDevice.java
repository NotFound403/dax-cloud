package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import cn.felord.common.enums.YoyoDeviceManagerTypeEnums;
import cn.felord.common.enums.YoyoDeviceStatusEnums;

import java.io.Serializable;

/**
 * 设备
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 15:25
 * @see YoyoDeviceManagerTypeEnums
 * @see  YoyoDeviceStatusEnums
 */
@TableName("yoyodevice")
public class YoyoDevice extends Model<YoyoDevice> {

  private static final long serialVersionUID = -1466035551670142608L;
  @TableId(type = IdType.AUTO)
   /** 设备信息ID */
  private long id;
   /** 投放的区域 */
  private String location;
   /** 设备ID */
  private String equId;
  /** 超级管理员或者代理商的id */
  private long uid;
  /**  0超级管理员  1 代理商 */
  private long utype;
  /** 广告信息对应Id */
  private long yoyoAdInfoId;
  /** 插入时间 */
  private String timer;
  /** 是否是删除状态  0 未删  1删除 */
  private long status;
  /** 幼儿园的名字 */
  private String parkName;


  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
    this.id = id;
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
   * Gets equ id.
   *
   * @return the equ id
   */
  public String getEquId() {
    return equId;
  }

  /**
   * Sets equ id.
   *
   * @param equId the equ id
   */
  public void setEquId(String equId) {
    this.equId = equId;
  }

  /**
   * Gets uid.
   *
   * @return the uid
   */
  public long getUid() {
    return uid;
  }

  /**
   * Sets uid.
   *
   * @param uid the uid
   */
  public void setUid(long uid) {
    this.uid = uid;
  }

  /**
   * Gets yoyo ad info id.
   *
   * @return the yoyo ad info id
   */
  public long getYoyoAdInfoId() {
    return yoyoAdInfoId;
  }

  /**
   * Sets yoyo ad info id.
   *
   * @param yoyoAdInfoId the yoyo ad info id
   */
  public void setYoyoAdInfoId(long yoyoAdInfoId) {
    this.yoyoAdInfoId = yoyoAdInfoId;
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
   * Gets utype.
   *
   * @return the utype
   */
  public long getUtype() {
    return utype;
  }

  /**
   * Sets utype.
   *
   * @param utype the utype
   */
  public void setUtype(long utype) {
    this.utype = utype;
  }

  /**
   * Gets status.
   *
   * @return the status
   */
  public long getStatus() {
    return status;
  }

  /**
   * Sets status.
   *
   * @param status the status
   */
  public void setStatus(long status) {
    this.status = status;
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

  @Override
  public String toString() {
    return "{" +
            "id:" + id +
            ", location:" + location +
            ", equId:" + equId +
            ", uid:" + uid +
            ", utype:" + utype +
            ", yoyoAdInfoId:" + yoyoAdInfoId +
            ", timer:" + timer +
            ", status:" + status +
            ", parkName:" + parkName +
            '}';
  }

  @Override
  protected Serializable pkVal() {
    return id;
  }
}
