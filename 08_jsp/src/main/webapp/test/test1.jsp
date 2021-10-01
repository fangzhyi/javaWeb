<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border: 1px cornflowerblue solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px cornflowerblue solid;
        }
    </style>
</head>
<body>
   <h1 align="center">九九乘法表</h1>
   <table align="center" >
   <%  for(int i=1;i<=9;i++){ %>
       <tr>
           <%  for (int j=1;j<=i;j++){ %>
           <td>
               <%=j+"*"+i+"="+(i*j)%>
           </td>
       <% } %>
       </tr>
      <% } %>
   </table>
</body>
</html>
