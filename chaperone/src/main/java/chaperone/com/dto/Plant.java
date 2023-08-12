package chaperone.com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Plant {
    @Id
    private long plantId;
    private String name;
    private double rating;
    private float markPrice;
    private float sellingPrice;
    private String description;
    private String colour;
    private String size;
    @OneToOne
    private Pot pot;
    @OneToOne
    private Category category;
    @OneToOne
    private Nursery nursery;
}
