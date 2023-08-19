package chaperone.com.model.address;

import chaperone.com.model.Employee;
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
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    private String locality;
    private String city;
    private int pinCode;
    private String state;

    @OneToOne(mappedBy = "EmployeeAddress")
    @Column(name = "employee_id")
    private Employee employee;

}
