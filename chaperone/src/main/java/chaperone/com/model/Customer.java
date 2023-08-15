package chaperone.com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    @OneToOne()
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne(mappedBy = "customer")
    private Cart cart;
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookingList;
    @OneToMany(mappedBy = "customer")
    private List<OrderStatus> orderStatusList;
    @OneToMany(mappedBy = "customer")
    private List<Payment> paymentList;


}
