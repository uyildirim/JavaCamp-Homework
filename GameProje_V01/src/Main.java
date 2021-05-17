
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		
		Customer customer = new Customer();
		customer.setFirstName("Ugur");
		
		customerManager.add(customer);

		
	}

}
