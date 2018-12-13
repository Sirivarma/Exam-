<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
</head>
<body bgcolor="#ddd" align="center">
<h2>${msg}</h2><br>
<a href="sample">Home</a>
<form:form modelAttribute="user" action="logging">
<form:hidden path="username" value="${userid}"/>
<form:hidden path="password" value="${pass}"/>
<input type="submit" value="Back"/>
</form:form>
</body>
</html>