package chaperone.com.model;

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
public class Nursery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nurserId;
    private String contactPerson;
    private String mobileNumber;
    private String email;
    @OneToOne
    private Address address;
}
