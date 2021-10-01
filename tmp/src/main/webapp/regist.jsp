<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="registServlet" method="get">
    用户名：<input type="text" name="username"><br>
    验证码：<input type="text" name="code" style="width: 60px;">
    <img src="http://localhost:8080/tmp/kaptcha.jpg" style="width: 100px;height: 28px;"><br>
<%--   密码：<input type="text" name="password"><br>--%>
    <input type="submit" value="注册">
    </form>
</body>
</html>