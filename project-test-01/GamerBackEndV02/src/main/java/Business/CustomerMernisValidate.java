package Business;

import Business.Abstracts.CustomerValidateService;
import Entities.Customer;

public class CustomerMernisValidate implements CustomerValidateService {
    @Override
    public boolean validate(Customer customer) {
        if (customer.getFirstName() == "Ugur") {
            return true;
        }
        return false;

    }
}
