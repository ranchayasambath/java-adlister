<%--
  Created by IntelliJ IDEA.
  User: ranchayasambath
  Date: 4/1/22
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing-Game</title>
</head>
<body>
<form method="POST" action="/guess">
    <label>Guess between 1 and 3: </label><br>
    <input type="text" name="guess-input">
    <button type="submit">Submit</button>
</form>

</body>
</html>
