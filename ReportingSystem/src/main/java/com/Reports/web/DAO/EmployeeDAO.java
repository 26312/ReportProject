// This is under REPORTINGSYSTEM Project
package com.Reports.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Reports.web.Model.Employee;

public class EmployeeDAO {

	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portaloperations?useSSL=false", "root", "root");
			
			
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}catch(SQLException se) {
			System.out.println(se);
		}
		return con;
	}
	
	//Method To Authenticate Registered User And Log The In The System
	public static Employee validate(String username, String password) {
		
		Employee e = null;
		
		try {
			Connection con = EmployeeDAO.getConnection();
			
			String query = "Select * from emp_info where name = ? and password = ?";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			
			ResultSet rs = stmt.executeQuery();
			
				if(rs.next()) {
				e = new Employee();
				e.setName(username);
				e.setPassword(password);
			}
			con.close();
						
			}catch(SQLException ex) {
			ex.printStackTrace();
			}
		return e;
	}
	
	
	
	//Method To Register New Employee In The System
	public static int registerEmployee(Employee emp) {
		
		int result = 0;
		try {
		Connection con = EmployeeDAO.getConnection();
		
		String query = "insert into emp_info value(?,?,?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(query);
		
		stmt.setInt(1, emp.getID());
		stmt.setString(2, emp.getName());
		stmt.setString(3, emp.getPassword());
		stmt.setString(4, emp.getEmail());
		stmt.setString(5, emp.getCountry());
		
		result = stmt.executeUpdate();
		
		con.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
		
}
