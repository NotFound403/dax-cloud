package cn.felord.common.entity.dto;

import java.io.Serializable;

/**
 * The type Yoyo device dto.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 15:28
 */
public class YoyoDeviceDTO implements Serializable {

    private static final long serialVersionUID = 2086575773053524466L;
    /** 设备ID */
    private Long id;
    /** 投放的区域 */
    private Long yoyoAdInfoId;


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getYoyoAdInfoId() {
        return yoyoAdInfoId;
    }

    public void setYoyoAdInfoId(long yoyoAdInfoId) {
        this.yoyoAdInfoId = yoyoAdInfoId;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", yoyoAdInfoId:" + yoyoAdInfoId +
                '}';
    }
}
