<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Viewing ${game.name}</title>
</head>
<body>
	<p>Title: <c:out value="${game.name}"/></p>
	<p>Description: <c:out value="${game.description}"/></p>
	<p>Posted date: <c:out value="${game.getCreatedAt()}"/></p>
	<p>Developer: ${game.getUser().userName}</p>
	
	<c:if test="${game.getUser().id == userId }">
		<a href="/games/edit/${game.id}">edit</a>
		<form action="/games/delete/${game.id}" method="post">
    		<input type="hidden" name="_method" value="delete">
    		<input type="submit" value="Delete">
		</form>
	</c:if>
	<p><a href="/home">Home</a></p>
</body>
</html>