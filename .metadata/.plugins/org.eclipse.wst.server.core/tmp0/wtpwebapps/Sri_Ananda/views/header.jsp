<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Techtronixs</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.high {
	width: 100px;
	image-resolution: 25dpi;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">

<style type="text/css">
.backgroundclr {
	background-color: #59503e;
}
</style>

</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<ul class="nav navbar-nav">
			<li><a href="index" style="font-size: 20px; color: white;">Home</a></li>
			<li><a href="Billing" style="font-size: 20px; color: white;">Billing</a></li>
			<li><a href="InventoryByDate" style="font-size: 20px; color: white;">InventoryByDate</a></li>
			<li><a href="InventoryByPeriod" style="font-size: 20px; color: white;">InventoryByPeriod</a></li>
		</ul>
		<c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
			<li><a href="<c:url value="/admin" />">Admin</a></li>
		</c:if>

		<ul class="nav navbar-nav navbar-right">
			<c:if test="${pageContext.request.userPrincipal.name == null }">
				<li>
					<%-- <a href=' <c:url value="/login" />'>Login</a> --%>
				</li>
				<li><a href="<c:url value="login"/>" role="button"
					aria-haspopup="true" aria-expanded="false" class="fa fa-user"
					style="font-size: 20px; color: white">Login</a></li>
			</c:if>
			<c:if test="${pageContext.request.userPrincipal.name  != null}">
				<li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
				<li><a href='<c:url value="/logout" />'>Signout</a></li>
			</c:if>

		</ul>
	</div>
	</nav>
</body>
</html>