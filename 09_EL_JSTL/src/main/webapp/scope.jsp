<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      pageContext.setAttribute("key1","pageContext1");
      pageContext.setAttribute("key2","pageContext2");
      request.setAttribute("key2","request");
      session.setAttribute("key2","session");
      application.setAttribute("key2","application");
  %>
    ${requestScope.key2}
</body>
</html>
