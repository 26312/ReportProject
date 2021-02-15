<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Form</title>
<link rel="stylesheet" href="CSS/registerationform.css">
</head>
<body>
		<form action="register" method="post">
			<div  class="container"	align="center">
					<h1>Register</h1>
		    		<p>Please fill in this form to create an account.</p>
		    		<hr>
				
					<label for="ID"><b>ID </b></label> 
					<input type="text" placeholder="Enter ID" name="ID" required><br>
				
					<label for="Name"><b>Name </b></label></tr></td>
					<input type="text" placeholder="Name" name="name" required><br>
					
					<label for="Password"><b>Password </b></label>
					<input type="password" placeholder="Password" name="password" required><br>
						
					<label for="Email"><b>Email </b></label>
					<input type="text" placeholder="Email" name="email" required><br>
					
					<label for="Country"><b>Country </b></label>
					<input type="text" placeholder="Country" name="country" required><br>
				
				<p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
			
				<!-- <button type="submit" class="registerbtn" onclick="location.href='home.jsp'" >Register</button>   -->
				
				<button type="submit" class="registerbtn" onclick="home.jsp" >Register</button>  
 				<!-- <a href="home.jsp" class="registerbtn">Register</a> -->
			</div>
			
			<div class="container signin" align="center">
    			<p>Already have an account? <a href="home.jsp">Sign in</a>.</p>
  			</div>
		</form>
		
		
		
</body>
</html>