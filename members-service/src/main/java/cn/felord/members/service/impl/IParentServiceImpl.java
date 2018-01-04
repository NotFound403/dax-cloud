package cn.felord.members.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.Parent;
import cn.felord.members.mapper.ParentMapper;
import cn.felord.members.service.IParentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/1 17:18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IParentServiceImpl extends ServiceImpl<ParentMapper,Parent> implements IParentService {
}
