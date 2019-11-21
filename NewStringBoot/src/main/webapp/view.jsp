<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Form</h1>

<c:if test="${ not empty studentList}">
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Password</th>
</tr>

<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.password}</td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>