package in.com.mypractice;

public class PersonBean {
	
	private int id;
	private String name;
	private long contact;
	private int age;
	private String profession;
	private String address;
	
	public void setId(int id) {
		this.id = id;
		
	}
	public int getId(){
		return id;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
