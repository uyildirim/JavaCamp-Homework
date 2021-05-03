package workBook2;

public class User {
	private int id;
	private String fistName;
	private String lastName;
	private String nasinalityId;
	
	public User() {
		
	}

	public User(int id, String fistName, String lastName, String nasinalityId) {
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.nasinalityId = nasinalityId;
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

	public String getNasinalityId() {
		return nasinalityId;
	}

	public void setNasinalityId(String nasinalityId) {
		this.nasinalityId = nasinalityId;
	}


	public void getLasrtName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
