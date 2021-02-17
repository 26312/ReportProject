<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Raise Request</title>
<link rel="stylesheet" href="CSS/raiseRequest.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<a href="home.jsp" style="font-size:xx-large"> <h4>Hu<b>B</b>S<i>POT</i></h4> </a>
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
                      	<a href="#">Raise Request</a>
                      	<a href="#">View Requests</a>
                  
                	</div>
            </div>
		</div>
		 <div class="labels">
            <label for="Request Number">Request Number*</label><br><br>
										
		    <label for="Category">Category*</label><br><br>
												
			<label for="Contact Type">Contact Type*</label><br><br>
												
			<label for="Priority">Priority*</label><br><br>
												
			<label for="Status">Status*</label><br><br>
												
			<label for="Heading">Heading*</label><br><br>
												
			<label for="Description">Description</label><br><br>
        </div>
        <div class="inputs">
            <input type="text" placeholder="Incident Number" id="Incident Number" required><br><br>
    
            <select id="categoryTypes" required">
                <option id="Softwares">Softwares</option>
                <option id="Hardwares">Hardwares</option>
                <option id="Networks">Networks</option>
            </select><br><br>
        
            <select id="contactTypes" required>
                <option id="Phone">Phone</option>
                <option id="Email">Email</option>
                <option id="PersonalContact">Personal Contact</option>
                <option id="SelfService">Self Service</option>
            </select><br><br>
        
            <select id="priorityTypes" required>
                <option id="Priority-1">Priority-1 (High)</option>
                <option id="Priority-2">Priority-2 (Medium)</option>
                <option id="Priority-3">Priority-3 (Low)</option>
                <option id="Priority-4">Priority-4 (Low)</option>
            </select><br><br>
        
            <select id="statusTypes" required>
                <option id="Open">Open</option>
                <option id="InProgress">In Progress</option>
                <option id="Pending">Pending</option>
                <option id="Closed">Closed</option>
            </select><br><br>
        
            <input type="text" id="Heading" placeholder="Heading" required width="100px"><br><br>
        
            <textarea id="description" style="height: 50px; width: 500px"></textarea><br><br><br>
            <input type="submit" value="Create Incident" class="createIncident">		
        </div>
		
	</div>
		
		
		
		
</body>
</html>
