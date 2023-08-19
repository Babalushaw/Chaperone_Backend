package chaperone.com.service;

import chaperone.com.dto.PaymentDto;
import chaperone.com.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {
    Payment makePayment(PaymentDto paymentDto);

    List<Payment> paymentList();

    Payment getPayment(long paymentId);
}
