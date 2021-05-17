
public class CustomerManager {
	
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());

	}
	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi." + customer.getFirstName());
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log(customer.getFirstName()+" veri tabanına silimdi.");
		
	}
}
