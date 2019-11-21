<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Insert Form</h1>
<form name="myform" action="/save" method="post">
Name:<input type="text" name="name"/>
Password:<input type="password" name="password"/>
<input type="submit" value="submit">
<a href="/display">view</a>
</form>
</body>
</html>