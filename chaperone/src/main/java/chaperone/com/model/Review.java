package chaperone.com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String review;

    @ManyToOne()
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    @JsonIgnore
    private Plant plant;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Customer customer;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
