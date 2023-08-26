package chaperone.com.serviceImpl;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import chaperone.com.model.ProductImage;
import chaperone.com.model.Size;
import chaperone.com.repository.CategoryRepository;
import chaperone.com.repository.NurseryRepository;
import chaperone.com.repository.PlantRepository;
import chaperone.com.repository.PotRepository;
import chaperone.com.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class PlantServiceImpl implements PlantService {
    @Autowired
    private PlantRepository plantRepository;
    @Autowired
    private NurseryRepository nurseryRepository;
    @Autowired
    private PotRepository potRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public String addPlant(PlantDto plantDto) {
        try{
            Plant plant=new Plant();
            List<ProductImage> productImageList=new ArrayList<>();
            plantDto.getImageList().forEach(image->{
                ProductImage productImage=new ProductImage();
                productImage.setImage(image);
                productImageList.add(productImage);
            });
            Set<Size> sizes= new HashSet<>();
            plantDto.getSizeDtoList().forEach(sizeDto -> {
                Size size=new Size();
                size.setSellingPrice(sizeDto.getNurseryPrice()+ (sizeDto.getNurseryPrice() * sizeDto.getPercent())/100f);
                size.setName(sizeDto.getName());
                size.setQuantity(sizeDto.getQuantity());
                sizes.add(size);
            });

            plant.setCategoryList(plantDto.getCategoryList());
            plant.setDescription(plantDto.getDescription());
            plant.setName(plantDto.getName());
            plant.setProductImageList(productImageList);
            plant.setSizes(sizes);
            plant.setNurseryList(plantDto.getNurseryList());
            plant.setPotList(plantDto.getPotList());
            plantRepository.save(plant);
            return "plant added successfully";
        }catch (Exception e){
            return "yups not uploaded";
        }
    }

    @Override
    public String deletePlant(long plantId) {
        return null;
    }

    @Override
    public List<Plant> getPlant(String plantName) {
        return null;
    }

    @Override
    public List<Plant> palntList() {
        try{
            return plantRepository.findAll();
        }catch (Exception e){
            throw new RuntimeException("Server not available");
        }

    }

    @Override
    public List<Plant> getPlantByCategory(String category) {
        try {
            List<Plant> plantList=new ArrayList<>();
            categoryRepository.findAll().forEach(category1 -> {
                if(category1.getCategoryType().compareTo(category)==0){
                    plantList.add(category1.getPlant());
                }
            });
            return plantList;
        }catch (Exception e){
            throw new RuntimeException("Server not available");
        }

    }

}
