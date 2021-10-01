package com.example._07_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("response2 result");
        System.out.println(request.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
