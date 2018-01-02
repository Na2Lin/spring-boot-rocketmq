package com.tml.springbootrocketmq.dao.user;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    Map getUserById(@Param("userId") Integer userId);
}
