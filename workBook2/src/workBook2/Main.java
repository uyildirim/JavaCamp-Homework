package workBook2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Ugur","YILDIRIM");
		
		UserManager userManager = new UserManager();
		userManager.Add(user1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setTcNo("1534542521");
		
		

	}

}
