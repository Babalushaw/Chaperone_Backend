package chaperone.com.controller;

import chaperone.com.dto.CartDto;
import chaperone.com.model.Plant;
import chaperone.com.service.CartService;
import chaperone.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chaperone/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add_cart/{customerId}/{plantId}")
    public ResponseEntity<String> addToCard(@RequestBody CartDto cartDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.addToCard(cartDto));
    }
    @GetMapping("/get_cart/{customerId}")
    public ResponseEntity<Plant> getCartDetails(@PathVariable long customerId){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCartDetails(customerId));
    }
    @DeleteMapping("/delete_cart_items/{customerId}/{plantId}")
    public ResponseEntity<Plant> deleteCartItem(@PathVariable long customerId,@PathVariable long plantId){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.deleteCartItem(customerId,plantId));
    }

}
