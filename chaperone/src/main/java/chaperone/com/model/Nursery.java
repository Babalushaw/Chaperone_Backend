package chaperone.com.model;

import chaperone.com.model.address.NurseryAddress;
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
    @OneToOne(mappedBy = "nursery",cascade = CascadeType.ALL,orphanRemoval = true)
    private NurseryAddress address;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;
}
