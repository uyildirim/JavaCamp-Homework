package workBook2;

public class Main {

	public static void main(String[] args) {
		User student1 = new Student();
		student1.getId();
		student1.setFistName("Uğur");
		student1.getLasrtName("YILDIRIM");
		
		
		
		UserManager userManager = new UserManager();
		userManager.Add(student1);

		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setTcNo("1534542521");
		
		

	}

}
