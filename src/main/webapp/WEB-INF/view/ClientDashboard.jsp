<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- nav bar -->
<ul>
  <li><a href="#">Accounts</a></li>
  <li><a href="#news">Pay Bills</a></li>
  <li><a href="#contact">Transfer</a></li>
</ul>

<div class="account">
	<label>Account Number:</label><span>${acc.account_number} </span>
	<label>Balance :</label><span> ${acc.balance}</span>
	<button></button>
</div>

</body>
</html>