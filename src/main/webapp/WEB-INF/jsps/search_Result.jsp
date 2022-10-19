<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>
</head>
<body>
<h2>All Locations</h2>
<a href="show">Add Location</a>
<table>
	<tr>
		<td>id</td>
		<td>name</td>
		<td>code</td>
		<td>type</td>
		<td>Delete</td>
		<td>Update</td>
	</tr>
	<c:forEach items="${location}" var="location">
	<tr>
		<td>${location.id}</td>
		<td>${location.name}</td>
		<td>${location.codes}</td>
		<td>${location.type}</td>
		<td><a href="delete?id=${location.id}">Delete</a></td>
		<td><a href="update?id=${location.id}">Update</a></td>
	</tr>
	</c:forEach>

</table>
</body>
</html>