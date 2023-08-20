package chaperone.com.serviceImpl;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import chaperone.com.repository.CategoryRepository;
import chaperone.com.repository.NurseryRepository;
import chaperone.com.repository.PlantRepository;
import chaperone.com.repository.PotRepository;
import chaperone.com.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

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
    public String addPlant(PlantDto plantDto) {
        try{
            Plant plant=plantDtoPlant(plantDto);
            plant.setCategoryList(plantDto.getCategoryList());

            plantRepository.save(plant);
            return null;
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

            plant.setCategoryList(plantDto.getCategoryList());

            return plant;
        }catch (Exception e){
            return null;
        }

    }
}
