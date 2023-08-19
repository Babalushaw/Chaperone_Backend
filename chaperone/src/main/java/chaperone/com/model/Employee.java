package chaperone.com.model;

import chaperone.com.model.address.EmployeeAddress;
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
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String name;
    private String email;
    private String phone;
    private String role;
    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,orphanRemoval = true)
    private EmployeeAddress address;
    private String password;
}
