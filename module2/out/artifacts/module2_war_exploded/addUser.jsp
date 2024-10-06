<%--
  Created by IntelliJ IDEA.
  User: daria
  Date: 03.10.2024
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${user}</p>
<form method="post" action="add">
    <input type="text" placeholder="Firstname" name="firstname"/>
    </br>
    <input type="text" placeholder="Lastname" name="lastname"/>
    </br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
