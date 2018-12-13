<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</SCRIPT>

</head>
<body bgcolor="#00FFEE" align="center" onload="noBack();"
	onpageshow="if (event.persisted) noBack();" onunload="">
	<form:form modelAttribute="user" action="logging">
		<table align="center">
			<tr>
				<td>Enter Email Id</td>
				<td><form:input path="username" placeholder="Enter EmailId" /></td>
				<td><blink style="color:Red">${msg}</blink></td>
				<td><form:errors path="username" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><form:input path="password" placeholder="Enter password"
						type="password" /></td>
				<td><blink style="color: Red">${msg1}</blink></td>
				<td><form:errors path="password"/></td>
			</tr>
			<tr>
				<!-- style="image: url("src/main/webapp/WEB-INF/jsp/download.jpg");border: solid 0px #000000;  <img alt="submit" src="./download.jpg"> -->
				<td><input type="submit" name="submit" src="./download.jpg"
					alt="submit" width: 150 px; height: 220 px;" /></img></td>
				<td>dont't have an account? <a href="Register">Register now</a></td>
			</tr>
		</table>
	</form:form>
	<img alt="submit" src="./download.jpg"/>
</body>
</html>