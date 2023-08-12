package chaperone.com.serviceImpl;

import chaperone.com.dto.Customer;
import chaperone.com.repository.AddressRepository;
import chaperone.com.repository.CustomerRepository;
import chaperone.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        addressRepository.save(customer.getAddress());
        return customerRepository.save(customer);
    }
}
