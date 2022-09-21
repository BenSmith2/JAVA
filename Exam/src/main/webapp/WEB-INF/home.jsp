<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Login And Registration</title>
</head>
<body>

<h2>Welcome, <c:out value="${user.userName}"></c:out>!</h2>
<p><a href="/logout">logout</a></p>

<h3>Current Games</h3>

<table>
		<tr>
			<th>
				Title
			</th>
			<th>
				Platform
			</th>
		</tr>
		<c:forEach var="game" items="${games}">
			<tr>
	    		<td>
	    			<a href="/games/${game.id}"><c:out value="${game.name}"/></a>
	    		</td>
	    		<td>
	    			<c:out value="${game.genre}"/>
	    		</td>
		</c:forEach>
	</table>
	
	<a href="/games/new">Create New Game</a>

</body>
</html>