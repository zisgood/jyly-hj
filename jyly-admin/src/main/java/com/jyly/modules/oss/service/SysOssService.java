package com.jyly.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyly.common.utils.PageUtils;
import com.jyly.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author zhouhua
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
