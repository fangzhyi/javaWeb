package com.example._07_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("在Servlet中查看参数:"+username);

        Object key = request.getAttribute("key");
        System.out.println("柜台1是否有章:"+key);

        System.out.println("Servlet2处理自己的业务");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
