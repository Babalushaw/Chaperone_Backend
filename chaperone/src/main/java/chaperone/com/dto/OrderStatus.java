package chaperone.com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class OrderStatus {
    @Id
    private long orderStatusId;
    private String bookingDateTime;
    private String deliveryDateTime;
    @OneToOne
    private Booking booking;
    @OneToOne
    private Customer customer;

}
