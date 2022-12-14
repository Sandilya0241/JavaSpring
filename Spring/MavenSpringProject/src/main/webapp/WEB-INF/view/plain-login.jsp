<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Login Page</title>
<link rel="stylesheet" type="text/css" href="css/mystyles.css">

</head>
<body>
	<h3>My Custom Login Page</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	                                                     
		<jstl:if test="${param.error != null}">
			<i class="failed">Sorry! entered invalid user name/ password</i>	
		
		</jstl:if>
		
		<p>
		
		User Name: <input type="text" name="username" />
		
		<p>
		
		Password: <input type="password" name="password" />
		
		<p>
		
		<input type="submit" value="Login" />
		
	</form:form>
</body>
</html>