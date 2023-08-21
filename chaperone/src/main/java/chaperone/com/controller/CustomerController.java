package chaperone.com.controller;

import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Customer;
import chaperone.com.dto.CustomerDto;
import chaperone.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chaperone/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/add_customer")
    public ResponseEntity<String> addCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customerDto));
    }
    @PutMapping("/update_customer/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long customerId,@RequestBody CustomerDto customerDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.updateCustomer(customerId,customerDto));
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable long customerId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomer(customerId));
    }

}
