package com.example._07_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("在Servlet1中查看参数username:"+username);

        request.setAttribute("key","Servlet的章");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");

        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
