<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%><br>
<form method="POST" action="/login.jsp">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
    <c:if test="${null== param.username=='admin' && param.password=='password'}">
        <c:if test="${param.username=='admin' && param.password=='password'}">
            <c:redirect url="profile.jsp"/>
        </c:if>
    </c:if>
<%@include file="partials/footer.jsp"%>
</body>
</html>