package com.Servlet;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;
import sun.nio.ch.IOUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String downloadFileName = "2.jpg";
        //通过servletContext对象读取要下载文件内容
        ServletContext servletContext = getServletContext();
        //获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println(mimeType);
        //告诉客户端返回的数据类型
        response.setContentType(mimeType);
        //返回响应头，告诉客户端收到的数据用于下载
        //Content-Disposition响应头，表示收到的数据怎么处理
//      //attachment;表示附件，表示下载使用 filename=指定下载的文件名
        //url编码是把汉字转换成%xx%xx的格式
        if(request.getHeader("User-Agent").contains("Firefox")){
            response.setHeader("Content-Disposition","attachment;filename==?UTF-8?B?"+ new BASE64Encoder().encode("您好.jpg".getBytes("UTF-8")) +"?=");
        }else{
            response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode("您好.jpg","UTF-8"));
        }
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        //获取响应输出流
        OutputStream outputStream = response.getOutputStream();
        //读取输入流中全部的数据输出给输出流，输出给客户端
        IOUtils.copy(resourceAsStream,outputStream);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
