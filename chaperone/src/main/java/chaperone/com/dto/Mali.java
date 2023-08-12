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
public class Mali {
    @Id
    private long maliId;
    private String maliName;
    private String contactNumber;
    private String whatsappNumber;
    private String emailId;
    @OneToOne
    private Address address;

}
