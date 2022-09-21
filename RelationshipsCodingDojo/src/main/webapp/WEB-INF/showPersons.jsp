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
<title>Everybody</title>
</head>
<body>
	<h1>Current People:</h1>
	
	<table>
		<c:forEach var="person" items="${persons}">
			<tr>
	    		<td>
	    			<a href="/persons/${person.id}"><c:out value="${person.id}"/></a>
	    		</td>
	    		<td>
	    			<c:out value="${person.firstName}"/>
	    		</td>
	    		<td>
	    			<c:out value="${person.lastName}"/>
	    		</td>
	    		<td>
	    			<form action="/persons/destroy/${person.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete">
					</form>
	    		</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/persons/create">add</a>
	
	<h1>Dojo's:</h1>
	<table>
		<c:forEach var="dojo" items="${dojos}">
			<tr>
	    		<td>
	    			<a href="/dojos/${dojo.id}"><c:out value="${dojo.id}"/></a>
	    		</td>
	    		<td>
	    			<c:out value="${dojo.name}"/>
	    		</td>
	    		<td>
	    			<form action="persons/dojo/destroy/${dojo.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete">
					</form>
	    		</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/dojos/create">add</a>
	
</body>
</html>