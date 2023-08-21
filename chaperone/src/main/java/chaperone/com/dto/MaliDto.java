package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MaliDto {
    private String maliName;
    private String mobileNumber;
    private String whatsappNumber;
    private String password;
    private String email;
    private byte[] image;
    private AddressDto addressDto;
}
