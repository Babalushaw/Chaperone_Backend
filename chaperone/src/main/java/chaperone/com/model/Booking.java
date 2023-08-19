package chaperone.com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    private String date;
    private int numberOfQuantity;
    private float totalPrice;

    @ManyToOne()
    @JoinColumn(name = "plant_id", insertable = false, updatable = false)
    @JsonIgnore
    private Plant plant;

    @ManyToOne()
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    @JsonIgnore
    private Customer customer;

    @JsonIgnore
    @OneToOne(mappedBy = "booking",cascade = CascadeType.ALL)
    private Payment payment;

}
