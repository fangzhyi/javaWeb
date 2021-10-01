package com.test;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User(null, "fang","321","fang@qq.com"));
        userService.registUser(new User(null, "zhi","321","zhi@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"joker","1234",null)));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("joker1")){
            System.out.println("用户名已存在");
        }else {
            System.out.println("用户名可用");
        }
    }
}