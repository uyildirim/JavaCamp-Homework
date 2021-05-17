package DataAccess.Concrate.PostgreCustomerDao;

import DataAccess.Abstracts.CustomerDaoService;
import Entities.Customer;

public class PostgreCustomerDao implements CustomerDaoService {
    @Override
    public void add(Customer customer) {
        System.out.println("Postgre ile kullanıcı Eklendi. " + customer.getFirstName());
    }
}
