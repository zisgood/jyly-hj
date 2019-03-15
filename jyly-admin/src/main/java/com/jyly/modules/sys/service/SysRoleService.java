package com.jyly.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jyly.common.utils.PageUtils;
import com.jyly.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 角色
 *
 * @author zhouhua
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
