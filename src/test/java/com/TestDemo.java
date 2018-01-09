package com;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.one.dao.UserMapper;
import com.one.pojo.User;
import com.one.service.IUserService;
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestDemo {  
    private static Logger logger = Logger.getLogger(TestDemo.class);    
    @Resource  
    private IUserService userService = null;  
    
    @Resource  
    private UserMapper userMapper = null;  
 
    @Test  
    public void test1() {  
        User user =new User();
        user.setId(2);
        user.setAge(28);
        user.setUser_name("123");
        user.setPassword("21231");
        userMapper.insert(user);
    }  
} 