package chaperone.com.controller;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import chaperone.com.service.PlantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/chaperone/plant")
@Slf4j
public class PlantController {
    @Autowired
    private PlantService plantService;
    @PostMapping("/add_plant")
    public ResponseEntity<String> addPlant(@RequestBody PlantDto plantDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(plantService.addPlant(plantDto));
    }
    @DeleteMapping("/delete_plant/{plantId}")
    public ResponseEntity<String> deletePlant(@PathVariable long plantId){
        return ResponseEntity.status(HttpStatus.OK).body(plantService.deletePlant(plantId));
    }
    @GetMapping("/{plant_name}")
    public ResponseEntity<List<Plant>> getPlant(@PathVariable String plantName){
        return ResponseEntity.status(HttpStatus.OK).body(plantService.getPlant(plantName));
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Plant>> getPlantByCategory(@PathVariable String category){
        return ResponseEntity.status(HttpStatus.OK).body(plantService.getPlantByCategory(category));
    }
    @GetMapping("/plant_list")
    public ResponseEntity<List<Plant>> plantList(){
        log.info("fetching plant list");
        return ResponseEntity.status(HttpStatus.OK).body(plantService.palntList());
    }
}
