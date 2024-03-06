package in.com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ToSelectMethod {
	
	public static void main(String[] args) throws Exception {
		
		

	toselect();
			
	}

	private static void toselect() throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	Statement stmt = conn.createStatement();
		
	          ResultSet rs =   stmt.executeQuery("select * from emp4");	
		
	          while (rs.next()) {
				
	        	  System.out.print(rs.getInt(1));
	        	  System.out.print(" "+rs.getString(2));
	        	  System.out.println(" "+rs.getInt(3));
				
			}
	}
}
		
		
		
		
	




