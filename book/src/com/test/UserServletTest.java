package com.test;

import java.lang.reflect.Method;

public class UserServletTest {

    public void login(){
        System.out.println("login");
    }
    public void regist(){
        System.out.println("regist");
    }
    public void updataUser(){
        System.out.println("UpdataUser");
    }
    public void updataPassword(){
        System.out.println("UpdataPassword");
    }

    public static void main(String[] args) {
        String action = "regist";
        try {
            Method method = UserServletTest.class.getDeclaredMethod(action);
            method.invoke(new UserServletTest());
            System.out.println(method);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
