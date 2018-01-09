package com.one.dao;

import com.one.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}