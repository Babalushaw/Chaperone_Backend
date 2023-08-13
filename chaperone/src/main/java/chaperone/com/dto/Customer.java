package chaperone.com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String mobileNumber;
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne()
    private Cart cart;
    @OneToMany
    private List<Booking> bookingList;
    @OneToMany
    private List<OrderStatus> orderStatusList;
    @OneToMany()
    private List<Payment> paymentList;


}
