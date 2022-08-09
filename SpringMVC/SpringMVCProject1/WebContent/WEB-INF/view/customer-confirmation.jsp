<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer confirmation page</title>
</head>
<body>
	Customer name is <i>${customerAttribName.firstName} ${customerAttribName.lastName}</i>. 
	<br><br>
	${customerAttribName.ticketsCount} ticket(s) issued.
	
	<br><br>
	Customer's postal code is ${customerAttribName.postalCode}.
	
	<br><br>
	Customer's IFSC code is ${customerAttribName.strIFSCCode}.
	
	<br><br>
	Customer's Account code is ${customerAttribName.accountCode}.
	
</body>
</html>