<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show One Game</title>
</head>
<body>

	<p>Title: <c:out value="${game.title}"/></p>
	<p>Description: <c:out value="${game.description}"/></p>
	<p>Purchase date: <c:out value="${game.getCreatedAt()}"/></p>
	<p><a href="/games">Home</a></p>
</body>
</html>