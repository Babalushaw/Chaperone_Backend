package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingDto {
    private int numberOfQuantity;
    private long plantId;
    private long customerId;
    private float amount;
}
