<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>
    <input type="submit">
</form>
<% String username = request.getParameter("username");
   String password = request.getParameter("password");
   if(username.equalsIgnoreCase("a") && password.equalsIgnoreCase("a")){
       response.sendRedirect("profile.jsp");
   }
   else
   {
       response.sendRedirect("login.jsp");
   }
%>

</body>
</html>