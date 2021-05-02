package workBook2;

public class Instructor {
	private int id;
	private String tcNo;
	private String firstName;
	private String lastName;
	
	
	public Instructor() {

	}
	public Instructor(int id, String firstName, String lastName,String tcNo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
	}
	
	public int getId() {
		return id;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
