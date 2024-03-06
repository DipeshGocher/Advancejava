package in.com.mypractice;

import in.com.mypractice.PersonBean;
import in.com.mypractice.PersonModel;

public class TestPerson {
public static void main(String[] args)throws Exception {
	 
	// testAdd();
	testUpdate();
}

private static void testUpdate() throws Exception {
	
	PersonBean bean = new PersonBean();
	PersonModel model = new PersonModel();
	
	bean.setId(1);
	bean.setName("munni");
	bean.setContact(820922448);
	bean.setAge(17);
	bean.setProfession("Web Developer");
	bean.setAddress("paris");
	
	model.update(bean);
	

}





private static void testAdd() throws Exception{
	
	PersonBean bean = new PersonBean();
	PersonModel model = new PersonModel();
	
	bean.setId(1);
	bean.setName("munni");
	bean.setContact(820922448);
	bean.setAge(20);
	bean.setProfession("Full Stack Developer");
	bean.setAddress("indore");
	
	model.add(bean);
}
}



