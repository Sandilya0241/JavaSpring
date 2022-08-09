<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo JSP Home page</title>
</head>
<body>
	<h2>Company Home page</h2>
	<hr>
	
		User Name : <security:authentication property="principal.username"/>
		<br>
		<br>
		Role(s) : <security:authentication property="principal.authorities"/>
		<hr>
	
	<security:authorize access="hasRole('MANAGER')">
	<!-- Add Links for Managers and Admins -->
	
	<p>
		<a href="${pageContext.request.contextPath}/leaders">Leadership Meetings</a>
		(Only for Manager peeps)
	</p>
	
	<hr>
	</security:authorize>

	<security:authorize access="hasRole('ADMIN')">
	<p>
		<a href="${pageContext.request.contextPath}/systems">Administration Page</a>
		(Only for Admin peeps)
	</p>
	

	
	<hr>
	</security:authorize>
	Welcome to company's home page.
	<hr>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>
