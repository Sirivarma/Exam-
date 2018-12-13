<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Status</title>
</head>
<body>
<form action="change" method="get">
Enter Comments:<input type="text" value="" name="Comments"  placeholder="No comments" Required/>
<input type="hidden" name="appid" value="${appId}"/>
<input type="hidden" name="status" value="${msg}"/>
<input type="submit" value="done"/>
</form>
</body>
</html>