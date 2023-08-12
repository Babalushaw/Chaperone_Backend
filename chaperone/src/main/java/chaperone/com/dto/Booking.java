package chaperone.com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_booking")
public class Booking {
    @Id
    private long bookingId;
    private String date;
    private int numberOfQuantity;
    private float totalPrice;
    @OneToOne
    private Plant plant;
    @OneToOne
    private Customer customer;
    @OneToOne()
    private Address address;

}
