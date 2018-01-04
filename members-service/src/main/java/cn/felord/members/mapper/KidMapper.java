package cn.felord.members.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.Kid;
import cn.felord.common.entity.dto.KidDTO;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * 儿童相关
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/30 11:18
 */
public interface KidMapper extends BaseMapper<Kid> {


    /**
     * Find by parent id kid dto.
     *
     * @param parentId the parent id
     * @return the kid dto
     */
    Set<KidDTO>  findByParentId(@Param("parentId") long parentId);

    /**
     * feign client .
     *
     * @param kidId the kid id
     * @return the kid dto
     */
    KidDTO  findByKidId(@Param("kidId") Long kidId);
}
