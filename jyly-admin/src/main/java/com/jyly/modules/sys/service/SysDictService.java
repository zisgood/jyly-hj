package com.jyly.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyly.common.utils.PageUtils;
import com.jyly.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author zhouhua
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

