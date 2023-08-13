package chaperone.com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Mali {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maliId;
    private String maliName;
    private String contactNumber;
    private String whatsappNumber;
    private String emailId;
    @OneToOne()
    private Address address;

}
