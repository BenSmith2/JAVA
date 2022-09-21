<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>
	<form action = "/process/omikuji" method = "POST">
	<span>Pick any number from 5 to 25:</span><input type="number" name = "luckyNumber"><br>
	<span>Enter name of any city:</span><input type="text" name = "city"><br>
	<span>Enter name of any real person:</span><input type="text" name = "person"><br>
	<span>Enter any real profession or hobby:</span><input type="text" name = "hobby"><br>
	<span>Enter any type of living thing:</span><input type="text" name = "livingThing"><br>
	<span>Say something nice to someone:</span><input type="text" name = "niceMessage"><br>
	<input type="submit" value="submit"><br>
	</form>
</body>
</html>