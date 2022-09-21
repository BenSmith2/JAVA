<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new person</title>
</head>
<body>
	<form:form action="/persons/create" method="post" modelAttribute="person">
	<p><form:errors path="firstName" style="color: red"/></p>
	<p><form:errors path="lastName" style="color: red"/></p>

	<p>
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName"/>
	</p>
	<p>
		<form:label path="dojo">dojo:</form:label>
		<form:select path="dojo">
			<c:forEach var="dojo" items="${dojos}">
				<option value="${dojo.id}">${dojo.name}</option>
			</c:forEach>
		</form:select>
	</p>
	
	<input type="submit" value="Submit"/> 
	</form:form>
	<a href="/persons">Home</a>
</body>
</html>