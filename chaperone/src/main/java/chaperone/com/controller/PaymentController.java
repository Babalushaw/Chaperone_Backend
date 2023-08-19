package chaperone.com.controller;

import chaperone.com.dto.PaymentDto;
import chaperone.com.model.Payment;
import chaperone.com.service.CustomerService;
import chaperone.com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private CustomerService customerService;
    @PostMapping("/make_payment")
    public ResponseEntity<Payment> makePayment(@RequestBody PaymentDto paymentDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.makePayment(paymentDto));
    }
    @GetMapping("/get_payment/{customerId}")
    public ResponseEntity<List<Payment>> getPaymentDetails(@PathVariable long customerId){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getPaymentDetails(customerId));
    }
    @GetMapping("/payment_list")
    public ResponseEntity<List<Payment>> paymentList(){
        return ResponseEntity.status(HttpStatus.OK).body(paymentService.paymentList());
    }
    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPayment(@PathVariable long paymentId){
        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getPayment(paymentId));
    }
}
