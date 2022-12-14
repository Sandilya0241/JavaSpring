<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers List</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager (Without Service Layer)</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!-- Add our HTML table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>E-Mail</th>
				</tr>
				
				<c:forEach var="customer" items="${customers}">
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
					</tr>
				</c:forEach>
				
			</table>
		
		</div>
	</div>
	
	
</body>
</html>