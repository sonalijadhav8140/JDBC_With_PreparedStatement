package ScannerCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class select {
   
	
    
	public static void main(String[] args) {
	
             
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			
			String sql="select * from student";
			
			PreparedStatement ps = con.prepareStatement(sql);
			                
			               
			                
			                ResultSet rs= ps.executeQuery();
			                 
			                while(rs.next()) {
			                	System.out.print(rs.getInt(1)+" ");
			                	System.out.print(rs.getString(2)+" ");
			                	System.out.print(rs.getString(3)+" ");
			                	System.out.println();
			                	
			                }
			                 
			                 con.close();
			                 ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

	
}
