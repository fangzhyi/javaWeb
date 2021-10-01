<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
         Map<String, Object> map = new HashMap<>();
         map.put("a.a.a","aaaVlaue");
         map.put("b-b-b","bbbVlaue");
         map.put("c+c+c","cccVlaue");

         request.setAttribute("map",map);
     %>
    ${map["a.a.a"]}<br>
    ${map["b-b-b"]}<br>
    ${map['c+c+c']}<br>
</body>
</html>
