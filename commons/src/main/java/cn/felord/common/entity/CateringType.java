package cn.felord.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 *
 * 餐种
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 13:54
 */
@TableName("cateringtype")
public class CateringType extends Model<CateringType> {

  private static final long serialVersionUID = -1330550479657450699L;
  @TableId(type = IdType.UUID)
  private String typeId;
  private String typeName;
  private Long parkId;
  private String createTime;
  private String updateTime;


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public Long getParkId() {
    return parkId;
  }

  public void setParkId(Long parkId) {
    this.parkId = parkId;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  protected Serializable pkVal() {
    return typeId;
  }

  @Override
  public String toString() {
    return "{" +
            "typeId:" + typeId +
            ", typeName:" + typeName +
            ", parkId:" + parkId +
            ", createTime:" + createTime +
            ", updateTime:" + updateTime +
            '}';
  }
}
