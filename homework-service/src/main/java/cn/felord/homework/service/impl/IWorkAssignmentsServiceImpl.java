package cn.felord.homework.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.felord.common.entity.WorkAssignments;
import cn.felord.homework.mapper.WorkAssignmentsMapper;
import cn.felord.homework.service.IWorkAssignmentsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/25 15:00
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IWorkAssignmentsServiceImpl extends ServiceImpl<WorkAssignmentsMapper,WorkAssignments> implements IWorkAssignmentsService {
}
