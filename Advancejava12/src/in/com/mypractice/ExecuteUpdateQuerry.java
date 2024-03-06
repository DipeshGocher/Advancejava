package in.com.mypractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateQuerry {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	Statement stmt = 	conn.createStatement();
	
ResultSet rs = stmt.executeQuery("select * from masti");

while (rs.next()) {
	
	System.out.print(" "+rs.getInt(1));
	System.out.print(" "+rs.getString(2));
	System.out.print(" "+rs.getString(3));
	System.out.print(" "+rs.getString(4));
	System.out.println(" "+rs.getInt(5));
	
}
	}

}
