<%--
  Created by IntelliJ IDEA.
  User: ranchayasambath
  Date: 4/1/22
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pizza-order</title>
</head>
<body>
<form method="POST" action="/pizza-order">
    <label>Crust Type: </label>
    <select name="crust-type">
        <option value="Thin">Thin</option>
        <option value="Medium">Medium</option>
        <option value="Thick">Thick</option>
    </select><br><br>

    <label>Sauce Type: </label>
    <select name="sauce-type">
        <option value="Tomato">Tomato</option>
        <option value="Mariana">Marinara</option>
        <option value="Barbecue">Barbecue</option>
    </select><br><br>

    <label>Size: </label>
    <select name="size">
        <option value="Small">Small</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
    </select><br><br>

    <label>Topping: </label>
        <input value="Beef" name="toppings" type="checkbox">Beef
        <input value="Ham" name="toppings" type="checkbox">Ham
        <input value="Philly" name="toppings" type="checkbox">Philly
        <input value="Bacon" type="checkbox" name="toppings">Bacon<br>


    <label>Enter Your Delivery Address: </label><br>
    <textarea name="address" rows="5" cols="25"></textarea><br><br>
    <button type="submit">Submit</button>
</form>


</body>
</html>
