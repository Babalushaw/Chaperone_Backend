package chaperone.com.controller;

import chaperone.com.model.OrderStatus;
import chaperone.com.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/order")
public class OrderStatusController {
    @Autowired
    private OrderStatusService orderStatusService;
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderStatus> getOrder(@PathVariable long orderId){
        return ResponseEntity.status(HttpStatus.OK).body(orderStatusService.getOrder(orderId));
    }
    @GetMapping("/order_list")
    public ResponseEntity<List<OrderStatus>> getOrderList(){
        return ResponseEntity.status(HttpStatus.OK).body(orderStatusService.getOrderList());
    }
}
