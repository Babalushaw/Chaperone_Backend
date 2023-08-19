package chaperone.com.serviceImpl;

import chaperone.com.model.OrderStatus;
import chaperone.com.service.OrderStatusService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderStatusServiceImpl implements OrderStatusService {
    @Override
    public OrderStatus getOrder(long orderId) {
        return null;
    }

    @Override
    public List<OrderStatus> getOrderList() {
        return null;
    }
}
