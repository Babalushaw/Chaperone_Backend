package chaperone.com.serviceImpl;

import chaperone.com.dto.AddressDto;
import chaperone.com.model.Address;
import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.repository.AddressRepository;
import chaperone.com.repository.CustomerRepository;
import chaperone.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Customer addCustomer(CustomerDto customerDto) {
        try{
            Customer customer=getCustomerModel(customerDto);
            addressRepository.save(customer.getAddress());
            return customerRepository.save(customer);
        }catch(Exception e){
            return null;
        }

    }

    @Override
    public Customer getCustomer(long customerId) {
        return null;
    }

    @Override
    public List<Customer> customerList() {
        return null;
    }

    @Override
    public String deleteCustomer(long customerId) {
        return null;
    }

    @Override
    public String updateCustomer(Customer customer) {
        return null;
    }

    private Customer getCustomerModel(CustomerDto customerDto) {
        try{
            Customer customer=new Customer();
            Address address=new Address();
            AddressDto addressDto=customerDto.getAddressDto();

            customer.setName(customerDto.getName());
            customer.setEmail(customerDto.getEmail());
            customer.setMobileNumber(customerDto.getMobileNumber());

            address.setLocality(addressDto.getLocality());
            address.setCity(addressDto.getCity());
            address.setPinCode(addressDto.getPinCode());
            address.setState(addressDto.getState());
            customer.setAddress(address);
            return customer;
        }catch(Exception e){
            return null;
        }
    }
}
