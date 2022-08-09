<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation page</title>
</head>
<body>
	Student name is <i>${studentAttribName.firstName} ${studentAttribName.lastName}</i>. 
	
	Student likes <em>${studentAttribName.favoriteCourse}</em>.
	
	Student likes <em>${studentAttribName.favoriteCourse2}</em>. 
	
	Operating Systems : 
	 
	<ul>
		<c:forEach var="temp" items="${studentAttribName.operatingSystems}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
	
	
	<%--  Web Technologies :
	<ul>
		<c:forEach var="temp" items="${studentAttribName.webTechnologies}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
	--%>
</body>
</html>