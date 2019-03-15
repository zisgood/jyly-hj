package com.jyly.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author zhouhua
 */
@Mapper
public interface TokenDao extends BaseMapper<TokenEntity> {
	
}
