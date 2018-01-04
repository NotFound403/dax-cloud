package cn.felord.cookbook.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.CateringType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Catering type mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/12 13:42
 */
public interface CateringTypeMapper extends BaseMapper<CateringType> {

    /**
     * 根据幼儿园查询餐饮种类 没有幼儿园就查全部种类.
     *
     * @param parkId the park id
     * @return the list
     */
    List<String>  findByParkId(@Param("parkId") Long parkId);
 }
