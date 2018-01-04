package cn.felord.gateway.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.gateway.mapper.SensitiveHeaderMapper;
import cn.felord.gateway.service.ISensitiveHeaderService;
import cn.felord.common.entity.gateway.SensitiveHeader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/20 11:22
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ISensitiveHeaderServiceImpl extends ServiceImpl<SensitiveHeaderMapper, SensitiveHeader> implements ISensitiveHeaderService {
}
