<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    头部信息<br>
    主体内容<br>
<%--    <%@include file="/include/footer.jsp"%>--%>
<jsp:include page="/include/footer.jsp">
    <jsp:param name="username" value="joker"/>
    <jsp:param name="password" value="1234"/>
</jsp:include>
</body>
</html>
