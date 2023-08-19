package chaperone.com.service;

import chaperone.com.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {
    Booking booking(long customerId, long productId, int quantity);

    Booking getBooking(String phone);

    List<Booking> bookingList();

    String  deleteBooking(long bookingId);
}
