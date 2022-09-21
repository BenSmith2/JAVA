<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new dojo</title>
</head>
<body>
	<form:form action="/dojos/create" method="post" modelAttribute="dojo">
	<p><form:errors path="name" style="color: red"/></p>
	<p>
		<form:label path="name">Name</form:label>
		<form:input path="name"/>
	</p>
	<input type="submit" value="Submit"/> 
	</form:form>
	<a href="/persons">Home</a>
</body>
</html>