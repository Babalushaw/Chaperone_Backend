package chaperone.com.serviceImpl;

import chaperone.com.model.Plant;
import chaperone.com.service.PlantService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlantServiceImpl implements PlantService {
    @Override
    public Plant addPlant(Plant plant) {
        return null;
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
}
