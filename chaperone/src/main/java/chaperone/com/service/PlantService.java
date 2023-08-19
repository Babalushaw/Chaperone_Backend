package chaperone.com.service;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlantService {
    Plant addPlant(PlantDto plantDto);

    String deletePlant(long plantId);

    List<Plant> getPlant(String plantName);

    List<Plant> palntList();
}
