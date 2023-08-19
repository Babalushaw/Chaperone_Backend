package chaperone.com.service;

import chaperone.com.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderStatusService {
    OrderStatus getOrder(long orderId);

    List<OrderStatus> getOrderList();
}
