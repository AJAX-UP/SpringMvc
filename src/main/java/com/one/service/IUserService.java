package com.one.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.one.dao.UserMapper;
import com.one.pojo.User;

@Service
public class IUserService {
	
	@Resource 
	public UserMapper userMapper;
	
	public User getUserById(){
		Integer i=1;
		return userMapper.selectByPrimaryKey(i);
	}
}
