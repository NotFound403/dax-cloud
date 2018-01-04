package cn.felord.gateway.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.gateway.Router;
import cn.felord.common.entity.gateway.RouterDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Router mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/20 10:04
 */
public interface RouterMapper extends BaseMapper<Router> {

    /**
     * 可用路由列表.
     *
     * @return the router dto
     */
    List<RouterDTO> findAvailable();

    /**
     * Route switcher integer.
     *
     * @param routerId the router id
     * @param enable   the enable
     * @return the integer
     */
    Integer routeSwitcher(@Param("routerId") String routerId, @Param("enable") String enable);
}
