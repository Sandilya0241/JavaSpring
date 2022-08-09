<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
<meta charset="ISO-8859-1">
<title>Main menu page</title>
</head>
<body>
	<h2> Spring MVC Demo page</h2>
	<a href="hello/showForm">Go to Show Form</a>
	
	<br><br>
	
	<a href="spring/showForm">Go to Spring Version Show Form</a>
	
	<br><br>
	
	<img alt="Logo" src="${pageContext.request.contextPath}/resources/images/spring-logo.png">
	
	<br><br>
	
	<input type="button" onclick="doSomeStuff()" value="Click this button">
</body>
</html>