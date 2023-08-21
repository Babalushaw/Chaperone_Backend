package chaperone.com.service;

import chaperone.com.dto.CartDto;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    String addToCard(CartDto cartDto);
}
