<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Game</title>
</head>
<body>
<h1>New Game</h1>
	
	<form:form action="/games/new" method="post" modelAttribute="game">
		<form:errors path="description"/>
		<form:errors path="name"/>
		<form:errors path="genre"/>
		
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