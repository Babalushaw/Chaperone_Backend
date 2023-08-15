package chaperone.com.controller;

import chaperone.com.model.Payment;
import chaperone.com.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/chaperone/payment")
public class PaymentController {
//    @Autowired(required = true)
//    private PaymentService paymentService;
//    @PostMapping("/make_payment")
//    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
//        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.makePayment(payment));
//    }
}
