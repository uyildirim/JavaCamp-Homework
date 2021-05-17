package business;

import entities.Customer;

public interface CustomerCheckService {
    boolean CheckRealPerson(Customer customer);
}
