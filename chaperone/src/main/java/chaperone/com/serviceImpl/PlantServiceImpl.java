package chaperone.com.serviceImpl;

import chaperone.com.controller.PotController;
import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import chaperone.com.repository.CategoryRepository;
import chaperone.com.repository.NurseryRepository;
import chaperone.com.repository.PlantRepository;
import chaperone.com.repository.PotRepository;
import chaperone.com.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public Plant addPlant(PlantDto plantDto) {
        try{
            Plant plant=plantDtoPlant(plantDto);
            plant.setCategoryList(plantDto.getCategoryList());
            plant.setNursery(nurseryRepository.getReferenceById(plantDto.getNurseryId()));
            plant.setPot(potRepository.getReferenceById(plantDto.getPotId()));
            return plantRepository.save(plant);
        }catch (Exception e){
            return null;
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
        return null;
    }
    private Plant plantDtoPlant(PlantDto plantDto){
        try{
            Plant plant=new Plant();
            plant.setName(plantDto.getName());
            plant.setColour(plantDto.getColour());
            plant.setMarkPrice(plantDto.getMarkPrice());
            float price= plantDto.getMarkPrice()+(plantDto.getMarkPrice() * plantDto.getPercentageIncrease())/100;
            plant.setSellingPrice(price);
            plant.setSize(plantDto.getSize());
            plant.setCategoryList(plantDto.getCategoryList());

            return plant;
        }catch (Exception e){
            return null;
        }

    }
}
