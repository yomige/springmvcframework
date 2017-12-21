<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: fraser.yu
  Date: 8/21/2016
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title><spring:message code="user.add"></spring:message> </title>
</head>
<body>
    <c:url value="/demo/user/add" var="addUserUrl"/>
    <form:form method="post" modelAttribute="user" action="${addUserUrl}">
        <spring:message code="user.username" text="Username"/>
        <form:input path="username"/>
        <form:errors path="username"></form:errors><br>

        <spring:message code="user.password" text="Password"/>
        <form:input path="password"/>
        <form:errors path="password"></form:errors><br>

        <spring:message code="user.email" text="Email"/>
        <form:input path="email"/>
        <form:errors path="email"></form:errors><br>

        <spring:message code="user.id" text="ID"/>
        <form:input path="id"/>
        <form:errors path="id"></form:errors><br>

        <input type="submit" value="<spring:message code='user.submit'/>"/><br>
    </form:form>
</body>
</html>
