package DataAccess.Concrate.MysqlDatabase;

import DataAccess.Abstracts.CustomerDaoService;
import Entities.Customer;

public class MysqlCustomerDao implements CustomerDaoService {
    @Override
    public void add(Customer customer) {
        System.out.println("Mysql ile kullanıcı Eklendi. " + customer.getFirstName());

    }
}
