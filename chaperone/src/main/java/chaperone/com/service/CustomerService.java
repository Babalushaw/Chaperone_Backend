package chaperone.com.service;

import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer addCustomer(CustomerDto customerDto);
    Customer getCustomer(long customerId);
    List<Customer> customerList();
    String deleteCustomer(long customerId);
    String updateCustomer(Customer customer);

}
