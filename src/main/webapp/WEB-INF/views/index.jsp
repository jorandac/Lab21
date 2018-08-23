<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cupcakes and Coffee</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/solar/bootstrap.min.css" />
<link rel="stylesheet" href="/styles.css" />
</head>

<body style="background-color:Pink;">

<main class="container">
<center>
<img src="https://www.foodfromcornwall.co.uk/wp-content/uploads/cache/images/2018/08/cupcakes-and-coffee/cupcakes-and-coffee-992542181.png" alt="" height="200" width="200"><br>
<h1 style ="color:white">Welcome to Cupcakes and Coffee!</h1>
<p style ="color:white">Register With Us To Receive Discounts and other Promotions! <br> Click below to begin.</p>

<div>

<table class="table">
			<thead>
	
				<tr class="table-danger">
					<th>Item</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${item}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.quantity}</td>
					<td>${item.price}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		

<a class="btn btn-danger" href="/registration" role="button">Register With Us!</a>
</div>

<br>


<div>

          <h1 style ="color:white">Follow Us On Social Media!</h1>

          <a href="https://www.instagram.com/ladieslovetech">
          <img src="https://s22.postimg.cc/dkviiujb5/instagram-logo.png" alt="" height="30" width="35"> </a>
                
          <a href="https://www.linkedin.com/company/ladieslovetech">
          <img src="https://s8.postimg.cc/6b1e1uwk5/LIN.png" alt="" height="30" width="35"> </a>
	
	      <a href="https://www.facebook.com/Ladies-Love-Tech-1884507471870975/">
          <img src="https://s8.postimg.cc/wjcir8w39/image.png" alt="" height="30" width="35"> </a>
	
          <img src="https://s8.postimg.cc/gl3t13u5h/image.png" alt="" height="30" width="35">


</div>

</center>

</main>
</body>


</html>



