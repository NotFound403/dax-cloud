package cn.felord.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.felord.common.entity.securityserver.User;
import cn.felord.common.entity.securityserver.dto.UserDetail;
import org.apache.ibatis.annotations.Param;

/**
 * The interface User mapper.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/28 10:53
 */
public interface UserMapper extends BaseMapper<User> {
      /**
       * Find by name user.
       *
       * @param userName the user name
       * @return the user
       */
      User findByName(@Param("userName") String userName);

      /**
       * Gets user detail.
       *
       * @param userId the user id
       * @return the user detail
       */
      UserDetail  getUserDetail(@Param("userId") String userId);
}
