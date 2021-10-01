package com.servlet;

import com.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{
    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1","path1");
        cookie.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie);
    }
    protected void Life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("Life3600","Life3600");
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.findCookie("key1",req.getCookies());
        if(cookie!=null){
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defalutLife","defalutLife");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
    }
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie = new Cookie("key1","newValue1");
//        resp.addCookie(cookie);
        Cookie cookie = CookieUtils.findCookie("key1", req.getCookies());
        if(cookie!=null){
            cookie.setValue("newnewValue1");
            resp.addCookie(cookie);
        }
        resp.getWriter().write("cookie已经修改");
    }
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie iWantCookie = CookieUtils.findCookie("key1",cookies);
        resp.getWriter().write(iWantCookie.getValue()+"<br>");
        for (Cookie cookie : cookies) {
            resp.getWriter().write("cookie{"+cookie.getName()+"="+cookie.getValue()+"}<br>");

//            if("key1".equals(cookie.getName())){
//                iWantCookie = cookie;
//            }
        }
//        if(iWantCookie!=null){
//
//            resp.getWriter().write(iWantCookie.getValue());
//        }


    }
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("key1","value1");

        resp.addCookie(cookie);

        resp.getWriter().write("cookie创建成功!");
    }
}
