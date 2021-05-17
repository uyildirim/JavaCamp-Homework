package business;

import entities.Customer;
import entities.CustomerService;

public class CustomerManager implements CustomerService {


    @Override
    public void save(Customer customer) {
        System.out.println("Database kaydedildi. " + customer.getFirstName());
    }
}
