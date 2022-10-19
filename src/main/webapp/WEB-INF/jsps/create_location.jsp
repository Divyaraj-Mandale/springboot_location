<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location    |    create</title>
</head>
<body>
<h2>Location |  new location</h2>
<a href="listall">Get all Locations</a>
<form action="saveLocation" method="post">
<pre>
id<input type="text" name="id"/>
name<input type="text" name="name"/>
code<input type="text" name="codes"/>
type:
urban<input type="radio" value="urban" name="type"/>
rural<input type="radio" value="rural" name="type"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}
</body>
</html>