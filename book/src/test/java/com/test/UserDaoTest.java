package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin1")==null){
            System.out.println("用户名可用！");
        }else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"joker","1234","1234@qq.com")));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin","admin")==null){
            System.out.println("用户名或密码错误，登录失败！");
        }else {
            System.out.println("登录成功");
        }
    }
}