package chaperone.com.serviceImpl;

import chaperone.com.dto.PaymentDto;
import chaperone.com.model.Payment;
import chaperone.com.service.PaymentService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentServiceImpl implements PaymentService {

    @Override
    public Payment makePayment(PaymentDto paymentDto) {
        return null;
    }

    @Override
    public List<Payment> paymentList() {
        return null;
    }

    @Override
    public Payment getPayment(long paymentId) {
        return null;
    }
}
