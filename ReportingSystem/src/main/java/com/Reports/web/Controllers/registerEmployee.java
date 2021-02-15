package com.Reports.web.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Reports.web.Model.*;
import com.Reports.web.DAO.*;

//@WebServlet("register")
public class registerEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		EmployeeDAO empdao = new EmployeeDAO();
		
		int ID =  Integer.parseInt(request.getParameter("ID"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		Employee e = new Employee();
		
		e.setID(ID);
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);
		
		int result = empdao.registerEmployee(e);
		if(result>0) {
			System.out.println("Record Saved Successfully");
			response.sendRedirect("index.html");
		}else {
			System.out.println("Invalid Entry!!");
			request.getRequestDispatcher("index.html").include(request, response);  
		}
		
	}

}
