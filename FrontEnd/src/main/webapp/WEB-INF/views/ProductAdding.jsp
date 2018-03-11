<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Category</title>
<!-- To Access the Bootstrap link -->

<link rel="stylesheet" href="../resources/css/headercss.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<style>
 /* Back To Home Button */
 .cancelbtn{
   float: left;
   width: 7%;
   padding: 10px 15px;
   font-size:12px
 }
</style>
</head>
<body>

<!-- AddProduct coding  started -->
<jsp:include page="header.jsp"></jsp:include><br><br>
<a href="categorylist" style="font-family: cursive; color:gray;">CategoryList</a>&nbsp;&nbsp;&nbsp;&nbsp;
<!-- <a href="supplierlist" style="font-family: fantasy;">SUPPLIERLIST</a>&nbsp;&nbsp;&nbsp;&nbsp; -->
<a href="productlistview" style="font-family: cursive; color:gray;">ProductList</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="viewshipdetails" style="font-family: cursive; color:gray;">ViewAllShippingDetails</a>&nbsp;&nbsp;&nbsp;&nbsp;

<hr>
<form class="form-horizontal" action="addProduct" method="post" enctype="multipart/form-data">
<fieldset>

<!-- Form Name -->
<legend>ADD PRODUCTS</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_id">PRODUCT ID</label>  
  <div class="col-md-4">
  <input id="product_id"  name="id" placeholder="PRODUCT ID" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
  <div class="col-md-4">
  <input id="product_name" name="pname" placeholder="PRODUCT NAME" class="form-control input-md" required="" type="text">
    
  </div>
</div>


<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_categorie">PRODUCT CATEGORY</label>
  <div class="col-md-4">
    <select id="product_categorie" name="cid" class="form-control">
    
             <c:forEach var="cList" items="${clist}">

                <option value="${cList.categoryid}">${cList.categoryname}</option>
                </c:forEach>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_prices">PRODUCT PRICES</label>  
  <div class="col-md-4">
  <input id="available_quantity" name="price" placeholder="PRODUCTPRICES" class="form-control input-md" required="" type="text">
    
  </div>
</div>

 <!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Select Your Product Image</label>
  <div class="col-md-4">
    <input id="filebutton" name="file" class="input-file" type="file">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="doublebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">AddProduct</button>
 	<a href="index"> <button type="button" class="btn btn-primary">Cancel</button> </a>  
  </div>
 </div>
</fieldset>
</form>
          
     
    <jsp:include page="footer.jsp"></jsp:include>


</body>
</html>