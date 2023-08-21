package chaperone.com.service;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface PlantService {
    String addPlant(PlantDto plantDto);

    String deletePlant(long plantId);

    List<Plant> getPlant(String plantName);

    List<Plant> palntList();

    List<Plant> getPlantByCategory(String category);
}
