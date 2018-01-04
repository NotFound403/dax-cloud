package cn.felord.common.entity;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
/**
 *
 * 广告信息表实体类.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 13:41
 */
@TableName("yoyoadinfo")
public class YoyoAdInfo extends Model<YoyoAdInfo>{

  private static final long serialVersionUID = -1550781813498121231L;
  @TableId(type = IdType.AUTO)
  private long id;
  private String timer;
  private long status;
  private long senDuId;
  /** 采用UUID 没有什么意思 标识唯一  补坑 */
  private String mark;

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
   * Gets sen du id.
   *
   * @return the sen du id
   */
  public long getSenDuId() {
    return senDuId;
  }

  /**
   * Sets sen du id.
   *
   * @param senDuId the sen du id
   */
  public void setSenDuId(long senDuId) {
    this.senDuId = senDuId;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "{" +
            "id:" + id +
            ", timer:" + timer +
            ", status:" + status +
            ", senDuId:" + senDuId +
            '}';
  }

  @Override
  protected Serializable pkVal() {
    return id;
  }
}
