<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<h1>Test Page</h1>
	<form action = "/process" method = "POST">
		city:<input type = "text" name="city">
		submit:<input type = "submit">
	</form>
		<p><c:out value="${errorMessage}"/></p>
    	<p><c:out value="${city}"/></p>
</body>
</html>