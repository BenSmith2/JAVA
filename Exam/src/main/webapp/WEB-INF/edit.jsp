<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit ${game.name} </title>
</head>
<body>
<h1>Edit Game ${game.name}</h1>
	
	<form:form action="/games/edit/${game.id}" method="post" modelAttribute="game">
	<input type="hidden" name="_method" value="put">
			<p><form:errors path="name" style="color: red"/></p>
			<p><form:errors path="genre" style="color: red"/></p>
			<p><form:errors path="description" style="color: red"/></p>
	    <p>
	        <form:label path="name">Name</form:label>
	        
	        <form:input path="name"/>
	    </p>
	    
	    <p>
	        <form:label path="genre">Genre</form:label>
	        
	        <form:textarea path="genre"/>
	    </p>
		
		<p>
	        <form:label path="description">Description</form:label>
	     
	        <form:textarea path="description"/>
	    </p>
	   	
	    <input type="submit" value="Submit"/> 
	</form:form>
</body>
</html>