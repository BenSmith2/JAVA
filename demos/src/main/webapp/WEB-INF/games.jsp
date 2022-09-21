<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Games</title>
</head>
<body>
	<c:forEach var="game" items="${games}">
        <p><c:out value="${game.getName()}"></c:out> <c:out value="${game.getPrice()}"></c:out></p>
    </c:forEach>
</body>
</html>