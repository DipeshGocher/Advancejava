package in.co.rays.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.com.rays.bean.UserBean;

public class UserModel {
	
	
		public Integer nextPk() throws Exception{
			int pk = 0;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			
			PreparedStatement ps = conn.prepareStatement("select max(id) from user");
			
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			
			pk = rs.getInt(1);
		}	
			return pk+1;
		}
		
		public void add(UserBean bean) throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			
			ps.setInt(1,nextPk());
			ps.setString(2,bean.getFirstName());
			ps.setString(3,bean.getLastName());
			ps.setString(4,bean.getLoginId());
			ps.setString(5,bean.getPassword());
			ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ps.setString(7, bean.getAddress());
			
			int i = ps.executeUpdate();
			
			System.out.println("data inserted = " + i);
			
		}

	}



