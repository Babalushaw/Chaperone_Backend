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
    private String password;
    private String mobileNumber;
    private String role;
    private String designation;
    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,orphanRemoval = true)
    private EmployeeAddress address;
    @Lob
    private byte[] image;

}
