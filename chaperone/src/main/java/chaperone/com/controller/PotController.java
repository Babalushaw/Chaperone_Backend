package chaperone.com.controller;

import chaperone.com.model.Pot;
import chaperone.com.service.PotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chaperone/admin/pot")
public class PotController {
    @Autowired
    private PotService potService;

    @PostMapping("/add_pot")
    public ResponseEntity<Pot> addPot(@RequestBody Pot pot){
        return ResponseEntity.status(HttpStatus.CREATED).body(potService.addPot(pot));
    }
    @DeleteMapping("/delete_pot/{potId}")
    public ResponseEntity<String> deletePot(@PathVariable long potId){
        return ResponseEntity.status(HttpStatus.CREATED).body(potService.deletePot(potId));
    }
    @GetMapping("/{pot_name}")
    public ResponseEntity<List<Pot>> getPot(@PathVariable String  potName){
       // return ResponseEntity.status(HttpStatus.OK).body(potService.getPot(potName));
        return  ResponseEntity.status(HttpStatus.OK).body(new ArrayList<Pot>());
    }
    @GetMapping("/pot_list")
    public ResponseEntity<List<Pot>> getPotList(){
        return ResponseEntity.status(HttpStatus.OK).body(potService.getPotList());
    }

}
