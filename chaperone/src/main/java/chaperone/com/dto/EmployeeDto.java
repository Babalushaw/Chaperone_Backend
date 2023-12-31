package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private String role;
    private String designation;
    private byte[] image;
    private AddressDto addressDto;
}
