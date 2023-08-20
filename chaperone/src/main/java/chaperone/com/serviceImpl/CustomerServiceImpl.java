package chaperone.com.serviceImpl;

import chaperone.com.dto.AddressDto;
import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.model.Payment;
import chaperone.com.model.Plant;
import chaperone.com.repository.CustomerRepository;
import chaperone.com.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(CustomerDto customerDto) {
        try{
            Customer customer=getCustomerModel(customerDto);
            log.info(customerDto.getName()+ " added");

            return customerRepository.save(customer);
        }catch(Exception e){
            return null;
        }

    }

    @Override
    public Customer getCustomer(String phone) {
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
    public Customer updateCustomer(long customerId, CustomerDto customerDto) {
        return null;
    }

    @Override
    public Plant getCartDetails(long customerId) {
        return null;
    }

    @Override
    public Plant deleteCartItem(long customerId, long plantId) {
        return null;
    }

    @Override
    public List<Payment> getPaymentDetails(long customerId) {
        return null;
    }

    @Override
    public Customer findByEmail(String email) {
        try{
            return customerRepository.findAll().stream().filter(customer -> customer.getEmail().compareTo(email)==0).findAny().orElse(null);
        }catch (Exception e){
            return null;
        }

    }

    private Customer getCustomerModel(CustomerDto customerDto) {
        try{
            Customer customer=new Customer();

            AddressDto addressDto=customerDto.getAddressDto();

            customer.setName(customerDto.getName());
            customer.setEmail(customerDto.getEmail());
            customer.setMobileNumber(customerDto.getMobileNumber());


            return customer;
        }catch(Exception e){
            return null;
        }
    }
}
