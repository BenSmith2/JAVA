<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
<h1>JSP Test</h1>
<h1>Two plus two is: </h1>
<h2><c:out value="${2+2}"/></h2>
<h2><c:out value="${fruit}"/></h2>
<c:forEach var = "i" items="1,4,5,6,7,8,9">
    Item <c:out value = "No. ${i}"/><p>
</c:forEach>
<c:forTokens 
  items = "Patrick:Wilson:Ibrahima:Chris" 
  delims = ":" var = "name">
    <c:out value = "Name: ${name}"/><p>
</c:forTokens>
<c:set value="20" var="seconds"/>
<c:choose>
    <c:when test="${seconds le 30 }">
        <c:out value="${seconds} is less than 30"/>
    </c:when>
    <c:when test="${seconds eq 30 }">
        <c:out value="${seconds} is equal to 30"/>
    </c:when>
    <c:otherwise>
        <c:out value="${seconds} is greater than 30"/>
    </c:otherwise>
</c:choose>
<!--  Grace Hopper code moved to own JSP
<h1>Customer Name: <c:out value="${}"/></h1>
<h3>Item Name: <c:out value="${}"/></h3>
<h3>Price: <c:out value="${}"/></h3>
<h3>Description: <c:out value="${}"/></h3>
<h3>Vendor: <c:out value="${}"/></h3>
-->
</body>
</html>