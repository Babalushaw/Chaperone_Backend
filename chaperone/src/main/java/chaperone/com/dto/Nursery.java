package chaperone.com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Nursery {
    @Id
    private long nurserId;
    private String contactPerson;
    private String mobileNumber;
    private String email;
    @OneToOne
    private Address address;
}
