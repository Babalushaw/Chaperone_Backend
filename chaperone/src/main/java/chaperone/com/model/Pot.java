package chaperone.com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long potId;
    private String name;
    private float price;
    private String colour;
    private String size;
    private String material;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;
}
