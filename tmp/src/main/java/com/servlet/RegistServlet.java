package com.servlet;

import com.google.code.kaptcha.servlet.KaptchaServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        //获取验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //删除验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        String code = req.getParameter("code");
        if(code.equalsIgnoreCase(token)&&token!=null){

            System.out.println("保存到数据库"+username);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        req.getRequestDispatcher("/ok.jsp").forward(req,resp);
            resp.sendRedirect(req.getContextPath()+"/ok.jsp");
        }else {
            System.out.println("请不要重复提交表单");
        }
    }

}
