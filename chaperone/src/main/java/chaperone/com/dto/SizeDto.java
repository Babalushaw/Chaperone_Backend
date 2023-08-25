package chaperone.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SizeDto {
    private String name;
    private String quantity;
    private float percent;
    private float nurseryPrice;
}
