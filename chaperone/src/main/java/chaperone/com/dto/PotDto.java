package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PotDto {
    private long potId;
    private String name;
    private float price;
    private float priceIncreasePercentage;
    private String colour;
    private String size;
    private String material;
    private byte[] potImage;
}
