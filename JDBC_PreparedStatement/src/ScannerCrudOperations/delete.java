package ScannerCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {
        
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
               System.out.println("Enter id you wanna delete record");
               int id=sc.nextInt();
               
               
	
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			
			String sql="delete from student where id=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			                ps.setInt(1, id);
			               
			                
			                int update = ps.executeUpdate();
			                 
			                 if(update>0) {
			                	 System.out.println("record deleted...");
			                 }
			                 else {
			                	 System.out.println("id not exist");
			                 }
			                 
			                 con.close();
			                 ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}