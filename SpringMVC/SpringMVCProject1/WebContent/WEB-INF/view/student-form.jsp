<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="studentAttribName">
	
	First Name : <form:input path="firstName"/>
	
	<br><br>
	
	Last Name : <form:input path="lastName"/>
	
	<br><br>
	
	Country : <form:select path="country">
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="United States of America" label="United States of America"/>
		<form:option value="India" label="India"/>
		<form:option value="Japan" label="Japan"/>
		<form:option value="Germany" label="Germany"/>
	</form:select>
	
	<br><br>
	
	Gender : <form:select path="gender">
		<form:options items="${studentAttribName.genderOptions}" />
	</form:select>
	
	<br><br>
	
	Country Of Residence : <form:select path="countryOfResidence">
		<form:options items="${countryOfResidence}" />
	</form:select>
	
	<br><br>
		
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>