package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
         
	public static void main(String[] args) {
		
		
		
		try {
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Eshtablish JDBC Connection
			
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			   //sql query
			  String sql="insert into student(id,name,email) values(?,?,?)";
			  
			  //create object of prepared statement
			    PreparedStatement ps = con.prepareStatement(sql);
			                 ps.setInt(1, 1003);
			                 ps.setString(2,"Sarakshi");
			                 ps.setString(3,"rk@gmail.com");
			                
			   //execute sql query              
			                 ps.execute();
			                 
			                 ps.setInt(1, 1004);
			                 ps.setString(2,"Madhuri");
			                 ps.setString(3,"madhu@gmail.com");
			                 ps.execute();
			                 
			                 System.out.println("Data Saved..");
			      //close resourses
			            con.close();
			            ps.close();
			                 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
