package chaperone.com.service;

import chaperone.com.dto.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer addCustomer(Customer customer);
}
