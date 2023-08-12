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
public class Payment {
    @Id
    private String paymentId;
    private String DateTime;
    private String paymentMode;
    private float amount;
    @OneToOne
    private Booking booking;
    @OneToOne
    private Customer customer;
}
