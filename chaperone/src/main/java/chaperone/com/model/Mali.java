package chaperone.com.model;


import chaperone.com.model.address.MaliAddress;
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
public class Mali {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maliId;
    private String maliName;
    private String mobileNumber;
    private String whatsappNumber;
    private String password;
    private String email;
    @OneToOne(mappedBy = "mali",cascade = CascadeType.ALL,orphanRemoval = true)
    private MaliAddress address;

    @Lob
    private byte[] image;

}
