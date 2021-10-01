package com.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        System.out.println(servletContext);
        System.out.println("context1中获取域数据之前key1的值为" + servletContext.getAttribute("key1"));
        servletContext.setAttribute("key1","value1");
        System.out.println("context1中获取域数据key1的值为" + servletContext.getAttribute("key1"));
        System.out.println("context1中获取域数据key1的值为" + servletContext.getAttribute("key1"));
        System.out.println("context1中获取域数据key1的值为" + servletContext.getAttribute("key1"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
