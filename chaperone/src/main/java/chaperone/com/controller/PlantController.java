package chaperone.com.controller;

import chaperone.com.dto.PlantDto;
import chaperone.com.model.Plant;
import chaperone.com.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/admin/plant")
public class PlantController {
    @Autowired
    private PlantService plantService;
    @PostMapping("/add_plant")
    public ResponseEntity<Plant> addPlant(@RequestBody PlantDto plantDto){
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
    @GetMapping("/plant_list")
    public ResponseEntity<List<Plant>> plantList(){
        return ResponseEntity.status(HttpStatus.OK).body(plantService.palntList());
    }
}
