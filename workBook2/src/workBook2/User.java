package workBook2;

public class User {
	private int id;
	private String fistName;
	private String lastName;
	
	public User() {
		
	}

	public User(int id, String fistName, String lastName) {
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
	}

	
	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//FirtName
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	//LastNAme
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
