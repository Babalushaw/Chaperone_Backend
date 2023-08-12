package chaperone.com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Address {
    @Id
    private long addressId;
    private String locality;
    private String city;
    private int pinCode;
    private String state;

}
