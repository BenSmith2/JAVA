<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="/js/app.js"></script>
		<!-- for Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
<body>
    <h1>Hello World</h1>
    Two plus two is:
	<c:out value="${2+2}"/>
	<h1>Fruit of the Day</h1>

	<c:forEach var="fruit" items="${fruits}">
    <c:out value="${fruit.name}"/>
	</c:forEach>
</body>
</html>