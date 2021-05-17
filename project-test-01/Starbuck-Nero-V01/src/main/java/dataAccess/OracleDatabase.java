package dataAccess;

import entities.Customer;

public class OracleDatabase implements Database{

    @Override
    public void add(Customer customer) {
        System.out.println("Oracle Database "+ customer.getFirstName());
    }
}
