<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>scope.jsp页面</h1>
    <%
        request.setAttribute("key","request");
        pageContext.setAttribute("key","pageContext");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
    %>
    pageContext域是否有值：<%= pageContext.getAttribute("key") %><br>
    request域是否有值：<%= request.getAttribute("key") %><br>
    session域是否有值：<%= session.getAttribute("key") %><br>
    application域是否有值：<%= application.getAttribute("key") %><br>
<%--   <%--%>
<%--       request.getRequestDispatcher("/scope2.jsp").forward(request,response);--%>
<%--   %>--%>
      <jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
