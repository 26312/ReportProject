package com.Reports.web.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Reports.web.DAO.EmployeeDAO;
import com.Reports.web.Model.Employee;


public class loginEmployee extends HttpServlet {
	
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text.html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		EmployeeDAO empdao = new EmployeeDAO();
		
		Employee e = empdao.validate(username, password);
		String destPage = "Portal.jsp";
		
		if(e != null) {
			HttpSession session = request.getSession();
		    session.setAttribute("e", e);
		    destPage = "Portal.jsp";
		}else {
			String message = "Invalid username/password";
		    request.setAttribute("message", message);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
		dispatcher.forward(request, response);
		
		
		
	}

}
