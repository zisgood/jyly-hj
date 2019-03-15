package com.jyly.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author zhouhua
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
