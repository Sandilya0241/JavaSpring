<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring World</title>
</head>
<body>
	<h2>Welcome to Spring world!</h2>
	<br><br>
	Student Name : <%= request.getParameter("TXT_USRNAME") %>
	<br><br>
	Student Name (fetched by expression language): ${param.TXT_USRNAME}
</body>
</html>