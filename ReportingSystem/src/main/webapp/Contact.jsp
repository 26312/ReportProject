<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
<link rel="stylesheet" href="CSS/StyleSheet.css">
<link rel="stylesheet" href="CSS/contactForm.css">
</head>
<body>
		<div class="header" align="center">
			<img alt="contactFormHeader" src="images/contactformHeader.jpg" width="100%">
		</div>

		<div align="center" class="topnav">
			<a  href="home.jsp">Home</a>
			<a  href="Contact.jsp">Contact</a>
			<a  href="About.jsp">About</a>
		</div>
	
	
	<div class="master">
		<div class="side" align="left">
			<h1><b><u>Contact</u></b></h1>
			<br>
			<p>No matter where you are in the World - Our Customer Service will help you with any questions or request related to our Service.
			Simply select the relevant Country from the menu. Our team will be happy to assist you.</p>
		</div>




	<div class="container" align="center">
  		<form action="/action_page.php">
    		<label for="fname">First Name</label>
    		<input type="text" id="fname" name="firstname" placeholder="Your name.."><br>

    		<label for="lname">Last Name</label>
    		<input type="text" id="lname" name="lastname" placeholder="Your last name.."><br>

    		<label for="country">Country</label>
    			<select id="country" name="country">
      				<option value="australia">Australia</option>
      				<option value="canada">Canada</option>
      				<option value="germany">Germany</option>
      				<option value="India">India</option>
      				<option value="great britin">UK</option>
      				<option value="japan">Japan</option>
      				<option value="nepal">Nepal</option>
      				<option value="china">China</option>
      				<option value="usa">USA</option>
    				</select><br>

    		<label for="subject">Subject</label>
    			<textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
				<br>
    			<input type="submit" value="Submit">
  			</form>
		</div>
	</div>
	
	
	
</body>
</html>