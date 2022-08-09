<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style>
	.error {
		color:red;
	}
</style>
</head>
<body>

	<i>Fill all mandatory fields indicated by asterik.</i>
	<br><br>
	<form:form action="processForm" modelAttribute="customerAttribName">
	
	First Name : <form:input path="firstName"/>
	
	<br><br>
	
	Last Name (*) : <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	Number of tickets (*) : <form:input path="ticketsCount"/>
	<form:errors path="ticketsCount" cssClass="error"/>
	<br><br>
	
	Postal Code (*) : <form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error"/>
	<br><br>
	
	IFSC Code (*) : <form:input path="strIFSCCode"/>
	<form:errors path="strIFSCCode" cssClass="error"/>
	<br><br>
	
	Account Code (*) : <form:input path="accountCode"/>
	<form:errors path="accountCode" cssClass="error"/>
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>