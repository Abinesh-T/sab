<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="icon" href="./resources/images/Arun_brandings/Hatsun_icon.jpg">

    <title>Hatsun_Daily</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style> 
.high{width:100px; image-resolution:25dpi; } 
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <img class="" src="./resources/images/Arun_brandings/Home_Icon.png" >
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Exotic_Category">Exotic</a></li>
          <li><a href="Stick_Category">Stick</a></li>
          <li><a href="Cone_Category">Cone</a></li>
          <li><a href="Cup_Category">Cup</a></li>
          <li><a href="FamilyPack_Category">Family Packs</a></li>
          <li><a href="Other_category">Other Products</a></li>
        </ul>
      </li>
      <li><a href="#">ManageProducts</a></li>
      <li><form  class="form-inline mt-2 mt-md-4">
            <input class="form-control mr-sm-6" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-2" type="submit">Search</button>
          </form></li>
      </ul>
      
    <ul class="nav navbar-nav navbar-right">
      <li><a href="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
</body>
</html>