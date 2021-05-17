package Business;

import Business.Abstracts.CustomerService;
import Business.Abstracts.CustomerValidateService;
import DataAccess.Abstracts.CustomerDaoService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

    private CustomerDaoService customerDaoService;
    private CustomerValidateService customerValidateService;

    public CustomerManager(CustomerDaoService customerDaoService, CustomerValidateService customerValidateService) {
        this.customerDaoService = customerDaoService;
        this.customerValidateService = customerValidateService;
    }


    @Override
    public void add(Customer customer) {
        System.out.println("----------------");
        System.out.println(customerValidateService.validate(customer));
        customerDaoService.add(customer);
        System.out.println("----------------");

    }
}
