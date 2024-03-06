package in.co.rays.test;

import java.text.SimpleDateFormat;

import java.util.Date;
import in.com.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {

	
		public static void main(String[] args) throws Exception {
				
				
				testAdd();
				
			}

			private static void testAdd() throws Exception{
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

				UserBean bean = new UserBean();

				bean.setFirstName("Hritika");
				bean.setLastName("Sahu");
				bean.setLoginId("hritika@gmail.com");
				bean.setPassword("123");
				bean.setDob(sdf.parse("1998-09-01"));
				bean.setAddress("indore");

				UserModel model = new UserModel();
				
				model.add(bean);
			}
}








