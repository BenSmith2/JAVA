<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Page</title>
</head>
	<body>
		<h3>Add Book</h3>
			<form:form action="/books/processing" method="post" modelAttribute="book">
				<p>
					<form:label path="title">Title</form:label>
					<form:errors path="title"/>
					<form:input path="title"/>
				</p>
				<p>
					<form:label path="description">Description</form:label>
					<form:errors path="description"/>
					<form:input path="description"/>
				</p>
				<p>
					<form:label path="language">Language</form:label>
					<form:errors path="language"/>
					<form:input path="language"/>
				</p>
				<p>
					<form:label path="numberOfPages">Number Of Pages</form:label>
					<form:errors path="numberOfPages"/>
					<form:input path="numberOfPages"/>
				</p>
				<input type="submit" value="Submit"/>
			</form:form>
	</body>
</html>