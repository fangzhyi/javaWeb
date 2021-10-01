package com.example._07_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("key1","value1");
        System.out.println("曾到此一游 Response1");
//        //设置响应状态码
//        response.setStatus(302);
//        //设置响应头说明新的地址在哪
//        response.setHeader("Location","http://localhost:8080/07_servlet/response2");
          response.sendRedirect("http://localhost:8080/07_servlet/response2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
