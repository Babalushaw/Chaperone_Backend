package chaperone.com.dto;

import chaperone.com.model.Category;
import chaperone.com.model.Nursery;
import chaperone.com.model.Pot;
import chaperone.com.model.Size;
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
    private List<Category> categoryList;
    private List<SizeDto> sizeDtoList;
    private List<Pot> potList;
    private List<Nursery> nurseryList;
    private long nurseryId;
    List<byte[]> imageList;
}
