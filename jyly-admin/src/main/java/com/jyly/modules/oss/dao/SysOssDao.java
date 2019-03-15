package com.jyly.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author zhouhua
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
