<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Book</title>
</head>
<body>
	<h3><c:out value="${book.title}"/> </h3>
	<p>Description: <c:out value="${book.description}"/> </p>
	<p>Language: <c:out value="${book.language}"/> </p>
	<p>Number of pages: <c:out value="${book.numberOfPages}"/> </p>
</body>
</html>