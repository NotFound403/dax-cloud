package cn.felord.homework.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.WorkComment;
import cn.felord.homework.mapper.WorkCommentMapper;
import cn.felord.homework.service.IWorkCommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/25 14:58
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IWorkCommentServiceImpl extends ServiceImpl<WorkCommentMapper,WorkComment> implements IWorkCommentService{
}
