<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sample java Spring</title>
<!-- 
<link type="text/css" rel="stylesheet" href="style.css">
<link href="globalCSS.css" rel="stylesheet" type="text/css"/> -->
<style>
@charset "ISO-8859-1";

* {
	box-sizing: border-box;
}

body {
	margin: 0;
}

/* Style the header */
.header {
	/* background-color: yellow; */
	padding: 20px;
	text-align: center;
}
/* Style the footer */
.footer {
	background-color: #800000;
	padding: 20px;
	text-align: center;
	float: bottom;
	bottom: 400pt;
	position: absolute;
}
/* Style the top navigation bar */
.topnav {
	overflow: hidden;
	width: 20%;
	height: 400pt;
	background-color: #333;
}

/* Style the topnav links */
.topnav a {
	float: left;
	color: #00ffff;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.right {
	overflow: fixed;
	width: 80%;
	padding: 200pt height:400pt;
	background-color: #333;
}

/* Style the topnav links */
.right a {
	float: right;
	width: 80%;
	color: #00ffee;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}
/* Change color on hover */
.topnav a:hover { /* 
    background-color: #db24b7; */
	color: black;
}

/* Transition effect */
button {
	width: 100px;
	height: 60px;
	background-color: #333;
	-webkit-transition: width 2s, height 4s; /* For Safari 3.1 to 6.0 */
	transition: width 2s, height 4s;
}

button:hover {
	width: 140px;
	height: 100px;
}

#d1 {
	position: absolute;
	height: 350pt;
	width: 200pt;
	padding: 10pt 0pt;
	background-color: #333;
	border-style: solid;
	border-radius: 20px 20px 20px 20px;
	border-color: red;
}

#d2 {
	position: absolute;
	height: 350pt;
	width: 818pt;
	left: 200pt;
	padding: 10pt 0pt;
	background-color: lightpink;
	border-style: solid;
	border-radius: 20px 20px 20px 20px;
	border-color: red;
}

#d3 {
	background-color: #800000;
	padding: 30px;
	text-align: center;
	float: bottom;
	top: 440pt;
	width: 1020pt;
}
</style>
</head>
<body bgcolor=lightgreen align=center>
	<font color=red class="header"><h1>Welcome to spring boot
			application</h1></font>
	<font color="blue">
		<div align="left" class="topnav" id="d1">
			<ol>
				<li><button>
						<a href="Register">Register candidate</a>
					</button></li>
				<br>
				<br>
				<li><button>
						<a href="Login">Login into your account</a>
					</button>
					<br>
				<br>
			</ol>
		</div>
		<div class="right" id="d2">
			Welcome to the
			<h3>Candidate Recruitment System</h3>
		</div>
	</font>
	<div id="d3" class="footer">Candidate Recruitment System
		@CopyRight</div>
</body>
</html>