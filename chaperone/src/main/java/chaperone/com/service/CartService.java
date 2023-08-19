package chaperone.com.service;

import org.springframework.stereotype.Service;

@Service
public interface CartService {
    String addToCard(long customerId, long plantId);
}
