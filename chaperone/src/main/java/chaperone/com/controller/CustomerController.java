package chaperone.com.controller;

import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chaperone")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/add_customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customerDto));
    }
}
