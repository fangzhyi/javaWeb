<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    保存之前：${ requestScope.abc } <br>
    <c:set scope="request" var="abc" value="abcValue"></c:set>
    保存之后：${ requestScope.abc } <br>
    <hr>
    <c:if test="${ 12 == 12}">
        <h1>
            12等于12
        </h1>
    </c:if>
    <hr>
    <%
        request.setAttribute("height",138);
    %>
    <c:choose>
        <c:when test="${requestScope.height>190}">
            <h2>小巨人</h2>
        </c:when>
        <c:when test="${requestScope.height>180}">
            <h2>很高</h2>
        </c:when>
        <c:when test="${requestScope.height>170}">
            <h2>还可以</h2>
        </c:when>
        <c:otherwise>
            <c:choose>
                <c:when test="${requestScope.height>160}">
                    <h2>大于160</h2>
                </c:when>
                <c:when test="${requestScope.height>150}">
                    <h2>大于150</h2>
                </c:when>
                <c:when test="${requestScope.height>140}">
                    <h2>大于140</h2>
                </c:when>
                <c:otherwise>
                    <h2>小于140</h2>
                </c:otherwise>
            </c:choose>
        </c:otherwise>
    </c:choose>
</body>
</html>
