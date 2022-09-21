<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>
<h1>All Books</h1>
<a href="http://localhost:8080/books/create">Add Book</a>
	<table>
		<tr>
			<th>ID</th>
		    <th>Title</th>
		    <th>Language</th>
		    <th># Pages</th>
	    </tr>
		<c:forEach var="book" items="${books}">
	    	<tr>
	    		<td>${book.id}</td>
	    		<td><a href="http://localhost:8080/books/${book.id}">${book.title}</a></td>
  				<td>${book.language}</td>
  				<td>${book.numberOfPages}</td>
	    	</tr>
		</c:forEach>
	</table>
</body>
</html>