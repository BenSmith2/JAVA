<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Practice</title>
</head>
<body>

	<h3> Login </h3>
	<p><c:out value="${error}"></c:out></p>
	<form action='/login' method = 'POST'>
		<span>Email: <input type="text" name='email'></span>
		<span>Password: <input type='text' name='password'></span>
		<input type='submit' value='login'>
	</form>
	
	<c:out value='${emails}'></c:out>
	
</html>