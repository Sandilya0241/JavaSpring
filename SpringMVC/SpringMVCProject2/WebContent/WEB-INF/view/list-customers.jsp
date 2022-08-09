<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
			<h2>CRM - Customer Relationship Manager (By Service Layer inclusion)</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!-- Adding button for adding a customer -->
			
			<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
			<br>
			<form:form action="search" method="GET">
				Search Customer : <input type="text" name="searchInput"/> <input type="submit" value="Search" class="add-button"/>
			</form:form>
			<!-- Add our HTML table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>E-Mail</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="customer" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerID" value="${customer.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerID" value="${customer.id}"/>
					</c:url>
				
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td>
							<a href="${updateLink}">Update</a>
							|
							<a onclick="if(!(confirm('Are you about deleting this customer?'))) return false" 
							href="${deleteLink}">Delete</a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
		
		</div>
	</div>
	
</body>
</html>