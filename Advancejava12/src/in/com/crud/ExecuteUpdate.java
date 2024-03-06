package in.com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {
     public static void main(String[] args) throws Exception {
		
    	 
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 
    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
    	 
    	Statement stmt = conn.createStatement();
    	
    	int i = stmt.executeUpdate("insert into marksheet values(5, 'gopal',105,86,30,11)");
       System.out.println("data inserted "+ i);	 
	}
}
