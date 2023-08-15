package chaperone.com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
