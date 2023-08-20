package chaperone.com.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String name;
    private String mobileNumber;
    private String email;
    private String password;
    private AddressDto addressDto;
}
