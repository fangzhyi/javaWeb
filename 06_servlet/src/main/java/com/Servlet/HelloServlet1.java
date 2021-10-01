package com.Servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet1 implements Servlet {
    public HelloServlet1() {
        System.out.println("构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化方法");
        System.out.println("HelloServlet的别名:"+servletConfig.getServletName());
        System.out.println("HelloServlet的初始化参数:username="+servletConfig.getInitParameter("username"));
        System.out.println("获取ServletContext对象："+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet被访问了");
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        if("GET".equals(httpServletRequest.getMethod())){
            System.out.println("get请求");
        }else if("POST".equals(httpServletRequest.getMethod())){
            System.out.println("post请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destory销毁方法");
    }
}
