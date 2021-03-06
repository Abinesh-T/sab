<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="icon" href="./resources/images/Arun_brandings/Hatsun_icon.jpg">
 <title>Exotic</title>
 	<link rel="stylesheet" href="../resources/css/headercss.css"/>
<!-- datatable -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
<link rel="stylesheet" type="text/css" href="../resources/css/dataTables.bootstrap.min.css"/>


<link rel="stylesheet" type="text/css" href="../resources/css/datatables.css"/>


<link rel="stylesheet" type="text/css" href="../resources/css/datatables.min.css"/>

<!-- end -->

 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <style>

 /* Float cancel and signup buttons and add an equal width */
 .cancelbtn{
   float: right;
   width: 10%;
   padding: 14px 20px;
   font-size:18px
 }
</style>
 
</head>
<body>

<br/>
<jsp:include page="header.jsp"></jsp:include>
<a  href="index"> <button  type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">BackToHome</button></a>
<br><br>
	<table class="table table-striped table-bordered dt-responsive nowrap">

		<thead>
			<tr>

				<th>ID</th>
				<th>ProdutName</th>
				<th>Price</th>

				<th>Action</th>
				<th>Image</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${slist}" var="p">
				<tr>
					<td>${p.productid}</td>
					<td>${p.productname}</td>
					<td>${p.productprice}</td>
					<td><a class="fa fa-pencil-square-o" href="./product_edit?id=${p.productid}">
							</a> 
							<a class="fa fa-trash-o"	href="./product_delete?id=${p.productid}"></a></td>
					<td><img
						src="${pageContext.request.contextPath}/resources/images/${p.p_image}"
						class="img-rounded" alt="" width="75px" height="50px" /></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
  <script type="text/javascript" src="../resources/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../resources/js/dataTables.bootstrap.min.css"></script>

<script type="text/javascript">
$(document).ready(function(){
    $('.table').DataTable();
});
</script>
   <jsp:include page="footer.jsp"></jsp:include>              
</body>
</html>