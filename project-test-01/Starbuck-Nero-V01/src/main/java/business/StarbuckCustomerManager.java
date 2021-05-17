package business;

import dataAccess.Database;
import entities.Customer;

public class StarbuckCustomerManager extends CustomerManager{

    private CustomerCheckService customerCheckService;
    private Database database;

    public StarbuckCustomerManager(CustomerCheckService customerCheckService, Database database) {
        this.customerCheckService = customerCheckService;
        this.database = database;
    }

    @Override
    public void save(Customer customer) {
        System.out.println(customerCheckService.CheckRealPerson(customer));
        database.add(customer);
        System.out.println("Starbucks");

    }
}
