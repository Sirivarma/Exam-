<%@page import="org.hibernate.validator.constraints.SafeHtml.Tag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<style>
td {
	text-align: left;
}
</style>
</head>
<body bgcolor="#00FFEE" align="center">
	<div>
		<font color="Red">
			<h1>Welcome to Registration Page</h1>
		</font>
	</div>
	<div align="center">
		<font color="green"> <c:form action="registering"
				modelAttribute="register">
				<c:hidden path="candidateId" />
				<br>
				<table align="center">
					<tr>
						<td>Enter Candidate name</td>
						<td><c:input path="candidateName"
								placeholder="Enter candidate name" /></td>
								<td><c:errors path="candidateName"/></td>
					</tr>
					<tr>
						<td>Enter password</td>
						<td><c:input type="password" path="password"
								placeholder="Enter password" /></td>
								<td><c:errors path="password"/></td>
					</tr>
					<tr>
						<td>Enter the date of birth</td>
						<td><c:input type="date" path="dateOfBirth" max="2000-01-01"/></td>
								<td><c:errors path="dateOfBirth"/></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><c:radiobutton path="gender" value="Male" />Male <c:radiobutton
								path="gender" value="Female" />Female</td>
								<td><c:errors path="gender"/></td>
								</tr>
					<tr>
						<td>Enter contact number</td>
						<td><c:input path="contactNo"
								placeholder="Enter Contact number" /></td>
								<td><c:errors path="contactNo"/></td>
					</tr>
					<tr>
						<td>Enter Email Id</td>
						<td><c:input path="emailId" tyepe="EMAIL" placeholder="Choose Email " /></td>
								<td><c:errors path="emailId"/></td>
					</tr>
					<tr>
						<td>Enter Qualification</td>
						<td><c:input path="qualification"
								placeholder="Enter Qualification" /></td>
								<td><c:errors path="qualification"/></td>
					</tr>
					<tr>
						<td></td>
						<td><c:hidden path="userType" value="User"
								placeholder="Enter Qualification" /></td>
								<td><c:errors path="userType"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="Register"></td>
					</tr>
				</table>
			</c:form>
		</font>
	</div>
</body>
</html>