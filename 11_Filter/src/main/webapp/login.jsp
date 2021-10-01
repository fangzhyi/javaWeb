<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/6
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这是登录界面.login.jsp页面<br>
    <form action="http://localhost:8080/11_Filter/loginServlet" method="get">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit"><br>
    </form>
</body>
</html>
