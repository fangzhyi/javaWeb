<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     ${12 == 12} 或  ${12 eq 12}<br>
     ${12 != 12} 或  ${12 ne 12}<br>
     ${12 < 12} 或  ${12 lt 12}<br>
     ${12 > 12} 或  ${12 gt 12}<br>
     ${12 <= 12} 或  ${12 le 12}<br>
     ${12 >= 12} 或  ${12 ge 12}<br>
     <hr>
     ${21 == 21 && 12 > 11} 或 ${21 == 21 and 12 > 11}<br>
     ${21 == 21 || 12 > 11} 或 ${21 == 21 or 12 > 11}<br>
     ${! true} 或 ${not true}<br>
     <hr>
      ${ 12 + 12}<br>
      ${ 12 - 12}<br>
      ${ 12 * 12}<br>
      ${ 12 / 12} 或 ${ 12 div 12}<br>
      ${ 12 % 12} 或 ${ 12 mod 12}<br>
     <hr>
</body>
</html>
