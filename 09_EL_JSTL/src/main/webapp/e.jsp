<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
         request.setAttribute("emptynull", null);
         request.setAttribute("emptyStr", "");
         request.setAttribute("emptyArr", new Object[]{});
         List<String> list = new ArrayList<>();
         request.setAttribute("emptyList", list);
         Map<String, Object> map = new HashMap<String, Object>();
         request.setAttribute("emptyMap", map);
     %>
     ${empty emptynull}<br>
     ${empty emptyStr}<br>
     ${empty emptyArr}<br>
     ${empty emptyList}<br>
     ${empty emptyMap}<br>
    <hr>
    ${12 == 12? "joker": "fang"}
</body>
</html>
