<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>${HeaderName}</h1>

<div class="container">

<form action="${pageContext.request.contextPath}/login" method="post">
<div class="form-group">
<label for="uName">User Name: </label>
<input type="text" class="form-control" id="username" name="username" placeholder="Enter the user name">
</div>
<div class="form-group">
<label for="password">Password: </label>
<input type="password" class="form-control" id="password" name="password" placeholder="Enter the password">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>