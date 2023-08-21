package chaperone.com.service;

import chaperone.com.dto.BookingDto;
import chaperone.com.model.Booking;
import chaperone.com.response.BookingResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {
    BookingResponse booking(BookingDto bookingDto);

    Booking getBooking(long bookingId);

    List<Booking> bookingList();

    String  deleteBooking(long bookingId);
}
