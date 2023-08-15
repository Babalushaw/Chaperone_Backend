package chaperone.com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany
    private List<Category> categoryList;
    @OneToOne
    @JoinColumn(name = "nursery_id")
    private Nursery nursery;
    @OneToMany
    private List<ProductImage> productImageList;
}
