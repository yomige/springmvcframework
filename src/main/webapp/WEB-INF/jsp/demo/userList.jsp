<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fraser.yu
  Date: 8/21/2016
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title><spring:message code="user.list" text="User List"></spring:message> </title>
</head>
<body>

    <c:forEach items="${users}" var="user">
        ${user.id}——${user.username}——${user.email}——${user.nickname}<br>
    </c:forEach>
</body>
</html>
