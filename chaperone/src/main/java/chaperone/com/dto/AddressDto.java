package chaperone.com.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String locality;
    private String city;
    private int pinCode;
    private String state;
}
