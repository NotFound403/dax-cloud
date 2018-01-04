package cn.felord.common.enums;

import cn.felord.common.entity.YoyoCardEquid;

/**
 *
 * 一卡通类别
 * @author dax.
 * @version v1.0
 * @since 2017/11/30 15:05
 * @see YoyoCardEquid
 */

public enum CardTypeEnums {

       KID(0,"儿童"),
       TEACHER(1,"教师");

       private Integer type;
       private String  description;

    CardTypeEnums(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
