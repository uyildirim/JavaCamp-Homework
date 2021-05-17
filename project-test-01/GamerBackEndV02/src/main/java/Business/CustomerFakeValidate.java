package Business;

import Business.Abstracts.CustomerValidateService;
import Entities.Customer;

public class CustomerFakeValidate implements CustomerValidateService {
    @Override
    public boolean validate(Customer customer) {
        return false;
    }

}
