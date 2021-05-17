package inheritance2;

public class CustomerManager {
	public void add(Logger[] loggers) {
		
		System.out.println("Müşteri Eklendi.");
		
		for (Logger logger : loggers) {
			logger.log();
		}
		
	}
}
