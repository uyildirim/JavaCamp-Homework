import business.CustomerCheckManager;
import business.CustomerManager;
import business.NeroCustomerManager;
import business.StarbuckCustomerManager;
import dataAccess.OracleDatabase;
import entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Ugur","YILDIRIM", LocalDate.of(1987,01,01));

        CustomerManager customerManager = new StarbuckCustomerManager(new CustomerCheckManager(),new OracleDatabase());
        customerManager.save(customer);
    }
}
