package com.Reports.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Reports.web.Model.Incidents;

public class IncidentsDAO {

	
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
	
	// To Create a Method to View All the Incidents in the Database
	
	public static List<Incidents> getAllIncidents(){
		
		
		List<Incidents> list = new ArrayList<Incidents>();
		
		try {
			Connection con = IncidentsDAO.getConnection();
			String query = "select * from incidents";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				Incidents inc = new Incidents();
				
				inc.setIncidentID(rs.getInt(1));
				inc.setCategory(rs.getString(2));
				inc.setContactType(rs.getString(3));
				inc.setPriority(rs.getString(4));
				inc.setStatus(rs.getString(5));
				inc.setHeading(rs.getString(6));
				inc.setDescription(rs.getString(7));
				
				list.add(inc);
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
	
	
}
