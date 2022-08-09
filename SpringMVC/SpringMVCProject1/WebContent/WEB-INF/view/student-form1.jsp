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
	
	Java <form:radiobutton path="favoriteCourse" value="Java"/>
	Go <form:radiobutton path="favoriteCourse" value="Go"/>
	C# <form:radiobutton path="favoriteCourse" value="C#"/>
	Python <form:radiobutton path="favoriteCourse" value="Python"/>
	
	<br><br>
	
	<form:radiobuttons path="favoriteCourse2" items="${studentAttribName.favoriteCourse2Options}"/>
	
	<br><br>
	
	Operating Systems:
	
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
	Windows OS <form:checkbox path="operatingSystems" value="Windows OS"/>
	
	<br><br>
	
	<%--Web Technologies:
	
	  form:checkboxes items="${studentAttribName.webTechnologiesOptions}" path="${studentAttribName.webTechnologies}"/> --%>
	
	<br><br>
		
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>