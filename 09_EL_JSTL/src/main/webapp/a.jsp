<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","值");
%>
    表达式脚本输出key的值：<%=request.getAttribute("key")%><br>
    EL表达式输出key的值：${key}
</body>
</html>
