package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
      
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Eshtablish jdbc connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			//mysql query
			
			String sql="delete from student where id=?";
			
			//object of preparedststatement
              PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, 1);
                        
                        ps.execute();
                        System.out.println("Record Deleted...");
                        
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
