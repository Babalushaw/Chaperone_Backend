package chaperone.com.serviceImpl;

import chaperone.com.model.Booking;
import chaperone.com.service.BookingService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingServiceImpl implements BookingService {
    @Override
    public Booking booking(long customerId, long productId, int quantity) {
        return null;
    }

    @Override
    public Booking getBooking(String phone) {
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
