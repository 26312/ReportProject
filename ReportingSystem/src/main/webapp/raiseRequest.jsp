<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Raise Request</title>
<link rel="stylesheet" href="CSS/raiseRequest.css">
</head>
<body>
		<div class="header">
		<a href="home.jsp" style="font-size:xx-large;color: white ;"> <h4>Hu<b>B</b>S<i>POT</i></h4> </a>
		</div>
		
		<div class="navbar">
            <div class="dropdown">
                    <button class="dropbtn">INCIDENTS 
                          <i class="fa fa-caret-down"></i>
                    </button>
                <div class="dropdown-content">
                      <a href="raiseIncident.jsp">Raise New Incident</a>
                      <a href="viewIncidents">View Incidents</a>
                  
                </div>
			</div>
			<div class="dropdown">
                    <button class="dropbtn">REQUESTS 
                          <i class="fa fa-caret-down"></i>
                    </button>
                <div class="dropdown-content">
                      <a href="raiseRequest.jsp">Raise Request</a>
                      <a href="#">View Requests</a>
                  
                </div>
            </div>
</body>
</html>