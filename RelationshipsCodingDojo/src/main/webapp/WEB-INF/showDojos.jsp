<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo and Persons</title>
</head>
<body>
	<h1>${dojo.name}</h1>
	<table>
		<tr>
			<th>
				First Name:
			</th>
			<th>
				Last Name:
			</th>
		</tr>
			<c:forEach var="person" items="${dojo.person}">
				<tr>
					<td>
						<c:out value="${person.firstName}"/>
					</td>
					<td>
						<c:out value="${person.lastName}"/>
					</td>
				<tr>
			</c:forEach>
	</table>
	<a href="/persons">Home</a>
</body>
</html>