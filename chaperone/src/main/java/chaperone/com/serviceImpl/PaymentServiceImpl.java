package chaperone.com.serviceImpl;

import chaperone.com.dto.PaymentDto;
import chaperone.com.model.Payment;
import chaperone.com.service.PaymentService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    private String key="rzp_test_u0LT0fKMBXPZrF";
    private String secret="SlX53MmnMpWwfdYf6Bt7LI2i";

    @Override
    public Payment makePayment(PaymentDto paymentDto) {
        try {
            var client=new RazorpayClient(key,secret);
            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount", paymentDto.getAmount()*100); // amount in the smallest currency unit
            orderRequest.put("currency", "INR");
            orderRequest.put("receipt", "order_rcptId_11");

            Order order=client.orders.create(orderRequest);
            log.info(order.toString());

        } catch (RazorpayException e) {
            // Handle Exception
            System.out.println(e.getMessage());
        }
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
