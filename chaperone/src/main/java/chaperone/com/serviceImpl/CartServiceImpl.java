package chaperone.com.serviceImpl;

import chaperone.com.service.CartService;
import org.springframework.stereotype.Repository;

@Repository
public class CartServiceImpl implements CartService {
    @Override
    public String addToCard(long customerId, long plantId) {
        return null;
    }
}
