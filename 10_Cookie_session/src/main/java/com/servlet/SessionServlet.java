package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet{

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.getWriter().write("Session已经无效");
    }
    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);
        resp.getWriter().write("当前session超时时长为："+session.getMaxInactiveInterval()+"秒<br>");
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("session的默认超时时长为："+maxInactiveInterval+"秒<br>");
    }
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1","value1");
    }
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object key1 = req.getSession().getAttribute("key1");
        resp.getWriter().write("从Session中获取key1的值"+key1);
    }
    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        boolean aNew = session.isNew();
        String id = session.getId();
        resp.getWriter().write("得到的Session，他的id是："+id+"<br>");
        resp.getWriter().write("这个Session是否是新创建的："+aNew+"<br>");
    }
}
