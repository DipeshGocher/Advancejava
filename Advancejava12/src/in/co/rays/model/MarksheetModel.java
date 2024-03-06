package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.com.rays.bean.MarksheetBean;

public class MarksheetModel {
	
	
	
		
		                                    
		                               // *(for add)
		
	 public void add(MarksheetBean bean) throws Exception {
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		 
		 PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?, ? , ? , ? ,? ,?)");
		 
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getRollno());
		ps.setInt(4,bean.getChemistry());
		ps.setInt(5,bean.getPhysics());
		ps.setInt(6,bean.getMaths());
		
		int i = ps.executeUpdate();
		
		System.out.println("data inserted " +i);	
	 }

	 
	                      // * (for update)
		
		public void Update(MarksheetBean bean) throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
		
		PreparedStatement ps = conn.prepareStatement("update marksheet set name = ?,id = ?,chemistry = ?, physics= ?, maths = ? where rollno = ? ");
			  
		ps.setString(1,bean.getName());
		ps.setInt(2,bean.getId());
		ps.setInt(3,bean.getChemistry());
		ps.setInt(4,bean.getPhysics());
		ps.setInt(5,bean.getMaths());
		ps.setInt(6, bean.getRollno());
		
		
		int i = ps.executeUpdate();
		
		System.out.println("data updated " + i);
		}
		
		
		                    //   *(for delete)
		
		public void delete(int id) throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
			 
			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
			
			ps.setInt(1,id);
			
			int i = ps.executeUpdate();
			
			System.out.println("data deleted = " + i);
		}
		
		                       // *(for find  by id) 
		
		public MarksheetBean findById(int id) throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			MarksheetBean bean = null;
			
			while (rs.next()) {
				bean = new MarksheetBean();
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setRollno(rs.getInt(3));
				bean.setChemistry(rs.getInt(4));
				bean.setPhysics(rs.getInt(5));
				bean.setMaths(rs.getInt(6));	
			}
			return bean;
		}
		
		
		public List search() throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

			PreparedStatement ps = conn.prepareStatement("select * from marksheet");

			ResultSet rs = ps.executeQuery();

			List list = new ArrayList();

			while (rs.next()) {
				
			
				MarksheetBean bean = new MarksheetBean();
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setRollno(rs.getInt(3));
				bean.setPhysics(rs.getInt(4));
				bean.setChemistry(rs.getInt(5));
				bean.setMaths(rs.getInt(6));
			
				list.add(bean);
			}
			return list;

		}
	}



