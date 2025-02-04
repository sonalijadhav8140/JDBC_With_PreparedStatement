package ScannerCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=null;
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			System.out.println("Enter many records you wanna insert");
			int cnt=sc.nextInt();
			for(int i=0;i<cnt;i++) {
				
			System.out.println("Enter id-");
			int id=sc.nextInt();
			
			System.out.println("Enter name-");
			String name=sc.next();
			
			System.out.println("Enter Email - ");
			String email=sc.next();
			
			String sql="insert into student(id,name,email) values(?,?,?)";
			
			ps = con.prepareStatement(sql);
					          ps.setInt(1, id);
					          ps.setString(2,name);
					          ps.setString(3,email);
					          ps.execute();
					          
			}          
					          System.out.println("Data Inserted Succcessfully...");
					          ps.close();
								con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
