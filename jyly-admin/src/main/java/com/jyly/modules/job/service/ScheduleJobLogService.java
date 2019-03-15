package com.jyly.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyly.common.utils.PageUtils;
import com.jyly.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author zhouhua
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
