<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><a href="Register">Register</a></h1>
<h1>Login</h1>
<form method="POST" action="dashboard">
	<table>
		<tr>
			<td>Username:</td>
			<td><input name="users" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input name="Password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login" /></td>
		</tr>
	</table>
</form>
</body>
</html>