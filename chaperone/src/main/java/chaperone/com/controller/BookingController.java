package chaperone.com.controller;

import chaperone.com.dto.BookingDto;
import chaperone.com.model.Booking;
import chaperone.com.response.BookingResponse;
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
    public ResponseEntity<BookingResponse> booking(@RequestBody BookingDto bookingDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingService.booking(bookingDto));
    }
    @GetMapping("/{phone}")
    public ResponseEntity<Booking> getBooking(@PathVariable long bookingId){
        return ResponseEntity.status(HttpStatus.OK).body(bookingService.getBooking(bookingId));
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
