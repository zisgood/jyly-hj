package com.jyly.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyly.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author zhouhua
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
