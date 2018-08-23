<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/solar/bootstrap.min.css" />
</head>
<body  style ="background-color:pink">
<center>
<main class="container">
<img src="https://www.foodfromcornwall.co.uk/wp-content/uploads/cache/images/2018/08/cupcakes-and-coffee/cupcakes-and-coffee-992542181.png" alt="" height="200" width="200"><br>

<h1  style ="color:white">Welcome to the site registration!</h1>
<h2  style ="color:white">Please enter the information below!</h2>

<form class="/summary" action="summary" method="get">

   <fieldset class="form">
   <legend>The basics</legend>
   
    <p>
        First Name: <input name="firstName" required minlength="2"/>
    </p>
    <p>
        Last Name: <input name="lastName" required minlength="2"/>
    </p>
    
     <p>  
     
    <input type="radio" name="gender" value="male" checked> Male<br>
    <input type="radio" name="gender" value="female"> Female<br>
    <input type="radio" name="gender" value="other"> Prefer Not to Answer
    
    </p>
    
    <p>
        Email: <input type="email" name="email"/>
    </p>
    <p>
        Phone Number: <input name = "phoneNum" required pattern = "[0-9]{10}" minlength ="10" maxlength ="10"/>
    </p>
    <p>
    
    </fieldset>
    
    <fieldset class="form">
   <legend>Authentication</legend>
    
    <p>
        Password: <input type="password" name="password"/>
    </p>
   
    <button type="submit" class="btn btn-danger"> Submit</button>    
    </p>
    
    </fieldset>
  
    
</form>

  
</main>
</body>

  </center>
</html>

