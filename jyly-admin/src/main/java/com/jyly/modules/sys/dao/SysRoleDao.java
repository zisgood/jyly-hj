package com.jyly.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色管理
 *
 * @author zhouhua
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	

}
