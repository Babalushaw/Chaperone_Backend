package chaperone.com.dto;

import chaperone.com.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlantDto {
    private String name;
    private float markPrice;
    private int percentageIncrease;
    private String description;
    private String colour;
    private String size;
    private List<Category> categoryList;
    private long nurseryId;
    private long potId;
    private byte[] image1;
    private byte[] image2;
    private byte[] image3;
    private byte[] image4;
}
