package com.jyly.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jyly.common.utils.PageUtils;
import com.jyly.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author zhouhua
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
