package in.com.mypractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonModel {
	
	public void add(PersonBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	PreparedStatement ps = conn.prepareStatement("insert into person values(?,?,?,?,?,?)");
	
	ps.setInt(1,bean.getId());
	ps.setString(2,bean.getName());
	ps.setLong(3, bean.getContact());
	ps.setInt(4, bean.getAge());
	ps.setString(5, bean.getProfession());
	ps.setString(6, bean.getAddress());
	
	int i = ps.executeUpdate();
	
	System.out.println("Data inserted = "+ i);
	
	}
	
	public void update(PersonBean bean) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	PreparedStatement ps = 	conn.prepareStatement("update person set name = ?, contact = ?, age = ?, profession = ?, address = ? where id = ?");
		
	ps.setString(1,bean.getName());
	ps.setLong(2,bean.getContact());
	ps.setInt(3,bean.getAge());
	ps.setString(4,bean.getProfession());
	ps.setString(5,bean.getAddress());
	ps.setInt(6,bean.getId());
	
	int i = ps.executeUpdate();
	
	System.out.println("data updated = "+ i);
			
	}

}
