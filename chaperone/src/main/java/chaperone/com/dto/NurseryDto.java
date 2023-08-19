package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NurseryDto {
    private String contactPerson;
    private String mobileNumber;
    private String email;
    private AddressDto addressDto;
}
