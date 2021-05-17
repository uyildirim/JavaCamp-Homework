package workBook2;

public class Main {

	public static void main(String[] args) {
		User student1 = new Student();
		student1.setId(1);
		student1.setFistName("Uğur");
		student1.getLasrtName("YILDIRIM");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFistName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setNasinalityId("1534542521");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

	}

}
