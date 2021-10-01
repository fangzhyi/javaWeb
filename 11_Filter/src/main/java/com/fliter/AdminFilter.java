package com.fliter;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {
    public AdminFilter() {
        System.out.println("1.filter的构造器方法AdminFilter()");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter的init(FilterConfig filterConfig)初始化");
        System.out.println("filter-name的值是："+filterConfig.getFilterName());
        System.out.println("初始化参数username的值是"+filterConfig.getInitParameter("username"));
        System.out.println(filterConfig.getServletContext());
    }

    @Override
    public void destroy() {
        System.out.println("4.Filter的destroy销毁方法");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("3.Filter的doFilter()过滤方法");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();

        Object user = session.getAttribute("user");

        if(user == null){
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }else {
            chain.doFilter(request,response);
        }
    }
}
