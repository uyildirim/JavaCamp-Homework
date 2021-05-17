package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "4321";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "9999";
		
		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = {engin,hepsiBurada,sendikaCustomer};
		
		customerManager.addMultiple(customers);
	}

}
