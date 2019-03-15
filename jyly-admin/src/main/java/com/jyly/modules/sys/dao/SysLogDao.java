package com.jyly.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author zhouhua
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
