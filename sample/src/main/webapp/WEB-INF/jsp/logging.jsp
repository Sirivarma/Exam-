<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style>
body {margin:0;}

.navbar {
  overflow: hidden;
  background-color: #333;
  position: fixed;
  top: 0;
  width: 100%;
}
.divbar {
  overflow: hidden;
  position: absolute;
  top: 100pt;
  width: 100%;
}

.navbar a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background: #ddd;
  color: black;
}

.main {
  padding: 16px;
  margin-top: 30px;
  height: 1500px; /* Used in this example to enable scrolling */
}
strong {
	 padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.divbar2{
  overflow: hidden;
  position: absolute;
  top: 200pt;
  width: 100%;
}
</style>
</head>

<body bgcolor="#00FFEE" align="center" >

<div class="navbar">
 <!--  <a href="#home">Home</a> --><h1><font color="#ddd">Welcome to the login page</font></h1>
  <!-- <a href="#news">News</a> -->
  <a href="Apply?id=${userid}" >Apply for job</a>
  <a href="viewApplications?id=${userid}">view Applied</a><%-- 
  <a href="status?id=${userid}">view Status</a> --%>
  <a href="viewProfile?id=${userid}"><strong>Welcome:<font color="red"><abbr title="viewProfile">${name}</abbr></font></strong></a><a href="Login">Logout</a>
</div>
<div class="divbar">
<br>
<h3>${userId}</h3>
				<br><br>
				${msg}</div>
				<div class="divbar2">
				<table width="100%">
				<tr><th>job title</th><th>organization Name</th><th>Vaccency</th><th>salary</th><th>Start Date</th>
				<th>Last Date</th><th>Qualification</th><th>Experience</th></tr>
				<c:forEach items="${joblist}" var="job">
				<tr>
				<td>${job.getJobTitle()}</td>
				<td>${job.getOrganizationName()}</td>
				<td>${job.getNumberOfVaccency()}</td>
				<td>${job.getJobSalary()}</td>
				<td>${job.getStartDate()}</td>
				<td>${job.getLastDate()}</td>
				<td>${job.getQualification()}</td>
				<td>${job.getExperience()}</td>
				</tr>
				</c:forEach>
								
				</table>
				</div>
</body>
</html>