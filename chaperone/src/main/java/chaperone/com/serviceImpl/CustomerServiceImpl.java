package chaperone.com.serviceImpl;

import chaperone.com.addresRepository.CustomerAddressRepository;
import chaperone.com.dto.AddressDto;
import chaperone.com.exception.CustomerException;
import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.model.Payment;
import chaperone.com.model.Plant;
import chaperone.com.model.address.CustomerAddress;
import chaperone.com.repository.CustomerRepository;
import chaperone.com.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerAddressRepository customerAddressRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public String addCustomer(CustomerDto customerDto) {
        try{
            if(customerRepository.findByMobile(customerDto.getMobileNumber())!=null){
                return "mobile number already register";
            }
            Customer customer=new Customer();
            customer.setName(customerDto.getName());
            customer.setEmail(customerDto.getEmail());
            customer.setMobileNumber(customerDto.getMobileNumber());
            customer.setPassword(bCryptPasswordEncoder.encode(customerDto.getPassword()));

            CustomerAddress customerAddress=new CustomerAddress();
            AddressDto addressDto=customerDto.getAddressDto();

            customerAddress.setCity(addressDto.getCity());
            customerAddress.setState(addressDto.getState());
            customerAddress.setPinCode(addressDto.getPinCode());
            customerAddress.setLocality(addressDto.getLocality());
            customer.setCustomerAddress(customerAddress);
            customerRepository.save(customer);
            return "customer added successfully";
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

}
