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
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productImageId;
    @Lob
    private byte[] image;
    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;
}
