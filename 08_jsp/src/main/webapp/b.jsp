<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/1
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"
         errorPage="/error500.jsp"
         language="java" %>
<%--         autoFlush="true"--%> //设置缓冲区满了自动刷新
<%--         buffer="8kb"--%> //设置缓冲区大小

<html>
<head>
    <title>Title</title>
</head>
<body>
这是b.jsp页面数据
<%
    int i = 12/0;
%>
</body>
</html>
