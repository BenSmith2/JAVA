<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<h1>Edit Person</h1>
	
	<form:form action="/persons/edit/${person.id}" method="post" modelAttribute="person">
	<input type="hidden" name="_method" value="put">
	
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
			<form:label path="dojo">Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			</form:select>
		</p>
	    <input type="submit" value="Submit"/> 
	    
	</form:form>
	
</body>
</html>