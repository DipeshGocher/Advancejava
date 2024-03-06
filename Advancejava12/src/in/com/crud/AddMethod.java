package in.com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddMethod {
	
	public static void main(String[] args) throws Exception {
		
		
		add(4, "ram", 30000);
		
		
	}

	private static void add(int id , String name, int salary) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	 Statement stmt = conn.createStatement();
	 
	int i =  stmt.executeUpdate("insert into emp4 values("+id+",'"+name+"',"+salary+")");
	 
	 System.out.println("data inserted " + i);
	
		
	}

}
