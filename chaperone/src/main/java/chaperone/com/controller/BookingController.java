package chaperone.com.controller;

import chaperone.com.model.Booking;
import chaperone.com.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/booking/{customerId}/{productId}/{quantity}")
    public ResponseEntity<Booking> booking(@PathVariable long customerId,@PathVariable long productId,@PathVariable int quantity){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingService.booking(customerId,productId,quantity));
    }
    @GetMapping("/{phone}")
    public ResponseEntity<Booking> getBooking(@PathVariable String phone){
        return ResponseEntity.status(HttpStatus.OK).body(bookingService.getBooking(phone));
    }
    @GetMapping("/booking_list")
    public ResponseEntity<List<Booking>> bookingList(){
        return ResponseEntity.status(HttpStatus.OK).body(bookingService.bookingList());
    }
    @DeleteMapping("/delete_booking/{bookingId}")
    public ResponseEntity<String> deleteBooking(@PathVariable long bookingId){
        return ResponseEntity.status(HttpStatus.OK).body(bookingService.deleteBooking(bookingId));
    }

}
