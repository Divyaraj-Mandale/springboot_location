<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location    |    update</title>
</head>
<body>
<h2>Location |  update location</h2>
<a href="show">Add Location</a>
<a href="listall">Get all Locations</a>
<form action="updateData" method="post">
<pre>
id<input type="text" name="id" value="${location.id}"/>
name<input type="text" name="name" value="${location.name}"/>
code<input type="text" name="codes" value="${location.codes}"/>
type:
urban<input type="radio" value="urban" name="type"/>
rural<input type="radio" value="rural" name="type"/>
<input type="submit" value="update"/>
</pre>
</form>
${msg}
</body>
</html>