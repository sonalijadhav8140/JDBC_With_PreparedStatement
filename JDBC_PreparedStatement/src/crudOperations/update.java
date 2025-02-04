package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    
	public static void main(String[] args) {
		
		
		
		try {
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Eshtablish JDBC Connection
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			//sql query
			String sql="update student set name=?,email=? where id=?";
			
			//preparedstatement object
			PreparedStatement ps = con.prepareStatement(sql);
			                  ps.setString(1,"Sneha");
			                  ps.setString(2, "sneha@gmail.com");
			                  ps.setInt(3, 1);
			                  ps.execute();//execute sql
			             
			                  System.out.println("Data Saved..");
			                  con.close();
			                  ps.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
