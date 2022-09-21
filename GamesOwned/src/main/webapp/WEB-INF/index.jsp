<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Games</title>
</head>
<body>
	
	
	<h1>Current Library of Games:</h1>
	
	<table>
		<tr>
			<th>
				Title
			</th>
			<th>
				Platform
			</th>
		</tr>
		<c:forEach var="game" items="${games}">
			<tr>
	    		<td>
	    			<a href="/games/${game.id}"><c:out value="${game.title}"/></a>
	    		</td>
	    		<td>
	    			<c:out value="${game.platform}"/>
	    		</td>
	    		<td>
	    			<a href="/games/${game.id}/edit">edit</a>
	    		</td>
	    		<td>
	    			<form action="/games/${game.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete">
					</form>
	    		</td>
	    		<td>
	    			<a href="/games/${game.id}/delete">delete</a>
	    		</td>
			</tr>
		</c:forEach>
	</table>
	
	
	
	<p>_______________________________________________</p>
	
	<h1>New Game</h1>
	
	<form:form action="/games" method="post" modelAttribute="game">
	
		<p><form:errors path="title" style="color: red"/></p>
		<p><form:errors path="description" style="color: red"/></p>
		<p><form:errors path="platform" style="color: red"/></p>
		<p><form:errors path="cost" style="color: red"/> </p>
	    <p>
	        <form:label path="title">Title</form:label>
	        
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="platform">platform</form:label>
	        
	        <form:select path="platform">
	        	<option value="Xbox">XboxOne/Ones/Xbox360</option>
	        	<option value="Windows">PC</option>
	        	<option value="Linux">Linux</option>
	        </form:select>
	   	</p>
	   	<p>
	        <form:label path="cost">Cost</form:label>
	            
	        <form:input path="cost"/>
	    </p>
	   	
	    <input type="submit" value="Submit"/> 
	</form:form>
</body>
</html>