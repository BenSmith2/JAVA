<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit and Update Expense</title>
</head>
<body>
<div>
<h1>Edit an expense:</h1>

<form:form action="/expense/${book.id}" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="expense">Expense</form:label>
        <form:errors path="expense"/>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
    <input type="submit" value="Submit"/>

</form:form>
</div>
</body>
</html>