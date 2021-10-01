<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/1
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是a.jsp页面数据
<%--声明--%>
    <%!
        private Integer id;
        private String name;
        private static Map<String,Object> map;
    %>
    <%!
        static {

            map = new HashMap<String,Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
            map.put("key4","value4");
        }
    %>
    <%!
        public int abc(){
            return 12;
        }
    %>
    <%!
        public static class A{
            private Integer id =12;
            private String abc = "abc";
        }
    %>
<%--    表达式--%>
    <%= 12%><br>
    <%= 12.212%><br>
    <%= "abcd"%><br>
    <%= map%><br>
    <%= request.getParameter("username")%><br>
<%--代码--%>
<%
    int i=12;
    if (i==12){
%>
        <h1>i等于12</h1>
<%--        System.out.println("i等于12");--%>
<%   }else {  %>
        <h1>i不等于12</h1>
<%--        System.out.println("i不等于12");--%>
<%     } %>



<table border="1">
<%
    for (int j = 0;j<10;j++){
%>
    <tr>
        <td>第<%=j+1%>行</td>
    </tr>
<%
//        System.out.println(j);
    }
%>
</table>


<%
    String username = request.getParameter("username");
    System.out.println(username);
%>

</body>
</html>
