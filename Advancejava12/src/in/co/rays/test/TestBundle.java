package in.co.rays.test;

import java.util.ResourceBundle;
	
	public class TestBundle {
		
		public static void main(String[] args) {
			
			ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.eng");
			
	   String driver =  rb.getString("don");
	   System.out.println(driver);
		}

	}


