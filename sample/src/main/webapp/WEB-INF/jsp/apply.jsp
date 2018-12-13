<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply for a job</title>
</head>
<body bgcolor="#bbb">
	<center>
		<h1>Apply for a job</h1>
	</center>
	<form:form action="applying" method="post" modelAttribute="application">
		<table align="center">
			<tr>
				<td>Applicant name:</td>
				<td><form:input path="ApplicantName"
						placeholder="Enter Your Name" /></td>
						<td><form:errors path="ApplicantName"/></td>
			</tr>
			<tr>
				<td>Applicant father name:</td>
				<td><form:input path="fatherName"
						placeholder="Enter your father name" /></td>
						<td><form:errors path="fatherName"/></td>
			</tr>
			<tr>
				<td>Choose your religion :</td>
				<td><form:select path="religion" items="${list}" /></td>
				<td><form:errors path="religion"/></td>
			</tr>
			<tr>
				<td>Enter Your Nationality :</td>
				<td><form:input path="nationality" /></td>
				<td><form:errors path="nationality"/></td>
			</tr>
			<tr>
				<td>Enter your Educational Qualification :</td>
				<td><form:input path="EducationalQualification" /></td>
				<td><form:errors path="EducationalQualification"/></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><form:input type="date" path="dateOfBirth" max="2000-01-01"/></td>
				<td><form:errors path="dateOfBirth"/></td>
			</tr>
			<tr>
				<td>Post name :</td>
				<td><form:input path="postApplied" /></td>
				<td><form:errors path="postApplied"/></td>
			</tr>
			<tr>
				<td>Enter Email Id :</td>
				<td><form:input type="email" path="emailId" /></td>
				<td><form:errors path="emailId"/></td>
			</tr>
			<tr>
				<td>Specialization :</td>
				<td><form:input path="specialization" /></td>
				<td><form:errors path="specialization"/></td>
			</tr>
			<tr>
				<td>Enter your Skills :</td>
				<td><form:input path="primarySkills" /></td>
				<td><form:errors path="primarySkills"/></td>
			</tr>
			<tr>
				<td>Language :</td>
				<td><form:input path="language" /></td>
				<td><form:errors path="language"/></td>
			</tr>
			<tr>
				<td>Present Address :</td>
				<td><form:input path="presentAddress" /></td>
				<td><form:errors path="presentAddress"/></td>
			</tr>
			<tr>
				<td>Permanent Address :</td>
				<td><form:input path="permenantAddress" /></td>
				<td><form:errors path="permenantAddress"/></td>
			</tr>
			<tr>
				<td></td>
				<td><form:hidden path="userId" value="${userId}" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%-- 
<tr><td></td><td><form:input path=""/></td></tr> --%>