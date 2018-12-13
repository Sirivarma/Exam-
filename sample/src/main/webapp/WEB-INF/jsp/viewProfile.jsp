<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<style>
body {margin:0;}

.navbar {
  overflow: hidden;
  background-color: #333;
  position: fixed;
  top: 0;
}

.navbar td {/* 
  float: left; 
  display: block;*/
  color: #f2f2f2;
  text-align: left;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* .navbar td:hover {
  background: #ddd;
  color: black;
} */

</style>
</head>
<body align="center">
<table class="navbar" width="100%" align="center">
<tr><td><big>Candidate Id</big></td><td>${profile.getCandidateId()}</td></tr>
<tr><td><big>Candidate Name</big></td><td>${profile.getCandidateName()}</td></tr>
<tr><td><big>Contact Number</big></td><td>${profile.getContactNo()}</td></tr>
<tr><td><big>Date of birth</big></td><td>${profile.getDateOfBirth()}</td></tr>
<tr><td><big>EmailId</big></td><td>${profile.getEmailId()}</td></tr>
<tr><td><big>Gender</big></td><td>${profile.getGender()}</td></tr>
<tr><td><big>Qualification</big></td><td>${profile.getQualification()}</td></tr>
<tr><td></<td><form:form modelAttribute="user" action="logging">
<form:hidden path="username" value="${profile.getCandidateId()}"/>
<form:hidden path="password" value="${profile.getPassword()}"/>
<input type="submit" value="Back"/>
</form:form></td></tr>
</table>

</body>
</html><%-- 
<tr><td><big></big></td><td>${profile.}</td></tr> --%>