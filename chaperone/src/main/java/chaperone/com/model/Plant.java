package chaperone.com.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "plant")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="plant_id")
    private long plantId;

    private String name;
    private double rating;

    @Column(name = "nursery_price")
    private float nurseryPrice;

    @Column(name = "selling_price")
    private float sellingPrice;

    private String description;


    @JsonIgnore
    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<Pot> potList=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<Category> categoryList;


    @JsonIgnore
    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<Nursery> nurseryList=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<ProductImage> productImageList;

    @Embedded
    @ElementCollection
    @Column(name="sizes")
    private Set<Size> sizes= new HashSet<>();

    @OneToMany(mappedBy = "plant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Rating> ratings=new ArrayList<>();

    @OneToMany(mappedBy = "plant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review> reviews=new ArrayList<>();

    @Column(name = "created_at")
    private LocalDateTime createAt;
}
