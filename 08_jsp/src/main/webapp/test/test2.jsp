<%@ page import="java.util.List" %>
<%@ page import="com.pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px red solid;
            width: 600px;
            border-collapse: collapse;

        }
        td,th{
            border: 1px cornflowerblue solid;
        }
    </style>
</head>
<body>
  <%
      List<Student> studentList = new ArrayList<Student>();
      for (int i=0;i < 10;i++){
          studentList.add(new Student(i+1,"name"+i,i+18,"1231212133"+i));
      }
  %>
  <table>
      <tr>
          <td>编号</td>
          <td>姓名</td>
          <td>年龄</td>
          <td>电话</td>
          <td>操作</td>
      </tr>
  <% for(Student student :studentList){ %>
      <tr>
          <td><%=student.getId()%></td>
          <td><%=student.getName()%></td>
          <td><%=student.getAge()%></td>
          <td><%=student.getPhone()%></td>
          <td>删除，修改</td>
      </tr>
  <%    } %>

  </table>
</body>
</html>
