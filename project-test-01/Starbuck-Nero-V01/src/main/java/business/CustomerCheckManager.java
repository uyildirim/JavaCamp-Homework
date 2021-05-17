package business;

import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
    @Override
    public boolean CheckRealPerson(Customer customer) {
        return true;
    }
}
