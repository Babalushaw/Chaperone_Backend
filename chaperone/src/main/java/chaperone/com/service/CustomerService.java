package chaperone.com.service;

import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.model.Payment;
import chaperone.com.model.Plant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer addCustomer(CustomerDto customerDto);
    Customer getCustomer(String phone);
    List<Customer> customerList();
    String deleteCustomer(long customerId);

    Customer updateCustomer(long customerId, CustomerDto customerDto);

    Plant getCartDetails(long customerId);

    Plant deleteCartItem(long customerId, long plantId);

    List<Payment> getPaymentDetails(long customerId);
}
