package chaperone.com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pot {
    @Id
    private long potId;
    private String name;
    private float price;
    private String colour;
    private String size;
    private String material;
}
