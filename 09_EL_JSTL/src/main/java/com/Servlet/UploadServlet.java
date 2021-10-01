package com.Servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("文件上传过来了");
//        ServletInputStream inputStream = request.getInputStream();
//        byte[] buffer = new byte[1024000];
//        int read = inputStream.read(buffer);
//        System.out.println(new String(buffer,0,read));
        //判断数据是否为多段的
          if(ServletFileUpload.isMultipartContent(request)){
              //创建FileItemFactory工厂实现类
              DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
              //创建用于解析上传数据的工具类ServletFileUpload类
              ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
              try {
                  //解析上传的数据，得到每一个表单项
                  List<FileItem> list = servletFileUpload.parseRequest(request);
                  //循环判断每一个表单项是普通类型还是文件
                  for (FileItem fileItem :list){
                      if (fileItem.isFormField()){
                          //普通表单项
                          System.out.println("表单项的name属性值："+fileItem.getFieldName());
                          System.out.println("表单项的value属性值："+fileItem.getString("UTF-8"));
                      }else {
                          //上传的文件
                          System.out.println("表单项的name属性值："+fileItem.getFieldName());
                          System.out.println("上传的文件名："+fileItem.getName());

                          fileItem.write(new File("e:\\"+fileItem.getName()));
                      }
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }

    }
}
