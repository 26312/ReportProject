package com.Reports.web.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Reports.web.DAO.IncidentsDAO;
import com.Reports.web.Model.Incidents;


public class viewIncidents extends HttpServlet {
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		List<Incidents> list = IncidentsDAO.getAllIncidents();
		
		out.println("<h4><u><b>Incident Information</b></u></h4>");
		
		out.print("<table border = '1' width='100%'");
		
		out.println("<tr><th>IncidentID</th><th>Category</th><th>ContactType</th><th>Priority</th><th>Status</th><th>Heading</th><th>Description</th></tr>");
		
		for(Incidents i:list) {
			
			out.print("<tr><td>" + i.getIncidentID() + "</td><td>" + i.getCategory() + "</td><td>" + i.getContactType() + "</td><td>" + i.getPriority() + "</td><td>" + i.getStatus() + 
					"</td><td>"+ i.getHeading() + "</td><td>" + i.getDescription() + "</td></tr>" );
			
		}
		out.print("</table>");
		
		out.println("<a href='raiseIncident.jsp'> Raise New Incident </a>");
	}

	
}
