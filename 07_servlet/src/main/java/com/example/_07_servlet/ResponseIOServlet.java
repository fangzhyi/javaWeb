package com.example._07_servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        response.setCharacterEncoding("UTF-8");//设置服务器的字符集
//        response.setHeader("Content-Type","text/html; charset=UTF-8");//设置浏览器的字符集
        response.setContentType("text/html; charset=UTF-8");//同时设置服务器和浏览器的字符集
        PrintWriter writer = response.getWriter();
        writer.write("response's contnet!!!");
        writer.write("您好！");
    }
}
