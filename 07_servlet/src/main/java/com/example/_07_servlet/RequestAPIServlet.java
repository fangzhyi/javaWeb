package com.example._07_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI => "+req.getRequestURI());
        System.out.println("URL => "+req.getRequestURL());
        System.out.println("客户端IP地址 => "+req.getRemoteHost());
        System.out.println("获取请求头User-Agent => "+req.getHeader("User-Agent"));
        System.out.println("获取请求头Accept => "+req.getHeader("Accept"));
        System.out.println("获取请求方法 =>"+req.getMethod());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
