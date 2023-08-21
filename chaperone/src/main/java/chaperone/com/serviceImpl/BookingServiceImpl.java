package chaperone.com.serviceImpl;

import chaperone.com.dto.BookingDto;
import chaperone.com.model.Booking;
import chaperone.com.response.BookingResponse;
import chaperone.com.service.BookingService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingServiceImpl implements BookingService {
    @Override
    public BookingResponse booking(BookingDto bookingDto) {
        return null;
    }

    @Override
    public Booking getBooking(long bookingId) {
        return null;
    }

    @Override
    public List<Booking> bookingList() {
        return null;
    }

    @Override
    public String deleteBooking(long bookingId) {
        return null;
    }
}
