package workBook2;

public class Instructor extends User{
	
	private int intructorId;
	private String givenCourse;

	
	public Instructor() {

	}
	
	public int getIntructorId() {
		return intructorId;
	}
	public void setIntructorId(int intructorId) {
		this.intructorId = intructorId;
	}
	public String getGivenCourse() {
		return givenCourse;
	}
	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}


}
