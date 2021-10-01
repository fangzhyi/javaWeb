package com.Servlet;

import com.pojo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> studentList = new ArrayList<Student>();
        for (int i=0;i < 10;i++){
            studentList.add(new Student(i+1,"name"+i,i+18,"1231212133"+i));
        }
        request.setAttribute("stuList",studentList);
        request.getRequestDispatcher("/test/showStudent.jsp").forward(request,response);
    }
}
