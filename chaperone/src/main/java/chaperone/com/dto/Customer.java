package chaperone.com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    private long id;
    private String name;
    private String mobileNumber;
    private String email;
    @OneToOne
    private Address address;
    @OneToOne
    private Cart cart;
    @OneToMany
    private List<Booking> bookingList;
    @OneToMany
    private List<OrderStatus> orderStatusList;
    @OneToMany
    private List<Payment> paymentList;


}
