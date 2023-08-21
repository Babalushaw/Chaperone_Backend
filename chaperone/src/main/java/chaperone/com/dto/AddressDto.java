package chaperone.com.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class AddressDto {
    private String locality;
    private String city;
    private int pinCode;
    private String state;
}
