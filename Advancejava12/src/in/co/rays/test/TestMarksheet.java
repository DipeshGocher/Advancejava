package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.model.MarksheetModel;
import in.com.rays.bean.MarksheetBean;

public class TestMarksheet {
	
	
	

		public static void main(String[] args) throws Exception {
			
		//	testAdd();
		 // testUpdate();
	    //	testDelete();
			// testFindById();
			testSearch();
		 }
		
		
		                      //   (for search)
		
		
		     private static void testSearch() throws Exception {
		    	 
		    	 MarksheetModel model = new MarksheetModel();
		    	 
		    	 List list = model.search();
		    	 
		    	 Iterator it = list.iterator();
		    	 
		    	 while (it.hasNext()) {
		    		 
		    		 MarksheetBean bean = (MarksheetBean) it.next();
		    		 
		    		 System.out.print(" "+bean.getId());
		    		 System.out.print(" "+bean.getName());
		    		 System.out.print(" "+bean.getRollno());
		    		 System.out.print(" "+bean.getChemistry());
		    		 System.out.print(" "+bean.getPhysics());
		    		 System.out.println(" "+bean.getMaths());
					
				}
			
			
		}

								// (find by id)
		
		 private static void testFindById() throws Exception {
			 
			 MarksheetModel model = new MarksheetModel();
			 
			 MarksheetBean bean = model.findById(6);
			 
			 if(bean != null) {
				 
				 System.out.print(" "+bean.getId());
				 System.out.print(" "+bean.getName());
				 System.out.print(" "+bean.getRollno());
				 System.out.print(" "+bean.getChemistry());
				 System.out.print(" "+bean.getPhysics());
				 System.out.println(" "+bean.getMaths());
				 
			 } else {
				 System.out.println("id doesn't exist");
			 }		
		 }

							// (for delete)
		
		private static void testDelete() throws Exception {
			
			MarksheetModel model = new MarksheetModel();
			
			model.delete(7);
		
		}

		
		                       // (for add)
		
		private static void testAdd() throws Exception {
			
			MarksheetBean bean = new MarksheetBean();
			MarksheetModel model = new MarksheetModel();
			
			
			bean.setId(7);
			bean.setName("mina");
			bean.setRollno(107);
			bean.setChemistry(82);
			bean.setPhysics(68);
			bean.setMaths(48);
				
			model.add(bean);
		}
		
		
		
		
		                        // (for update)

		private static void testUpdate() throws Exception{
			
			MarksheetBean bean = new MarksheetBean();
			MarksheetModel model = new MarksheetModel();
			
			bean.setId(6);
			bean.setName("mohit");
			bean.setRollno(106);
			bean.setChemistry(56);
			bean.setPhysics(39);
			bean.setMaths(92);
			
			model.Update(bean);
		}
		}



