package com.jyly.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典
 *
 * @author zhouhua
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {
	
}
