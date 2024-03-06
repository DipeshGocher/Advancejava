package in.co.rays.test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.com.rays.util.JdbcDataSource;

public class TestJdbc {

	
		
		public static void main(String[] args) throws Exception {
			
		
			testGet();
		}
			
		

		private static void testGet() throws Exception {
			
			
		Connection conn = JdbcDataSource.getConnection();
		
		   PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = 1");
		   
		   ResultSet rs = ps.executeQuery();
		   
		   while (rs.next()) {
			   
			   System.out.print(" " +rs.getInt(1));
			   System.out.print(" " +rs.getString(2));
			   System.out.print(" " +rs.getInt(3));
			   System.out.print(" " +rs.getInt(4));
			   System.out.print(" " +rs.getInt(5));
			   System.out.println(" " +rs.getInt(6));
			
		}
		   
		}

	}


