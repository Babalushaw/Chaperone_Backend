package chaperone.com.controller;

import chaperone.com.dto.NurseryDto;
import chaperone.com.model.Nursery;
import chaperone.com.service.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/nursery")
public class NurseryController {
    @Autowired
    private NurseryService nurseryService;
    @PostMapping("/add_nursery")
    public ResponseEntity<Nursery> addNursery(@RequestBody NurseryDto nurseryDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(nurseryService.addNursery(nurseryDto));
    }
    @DeleteMapping("/{nurserId}")
    public ResponseEntity<String> deleteNurser(@PathVariable long nurseryId){
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.deleteNursery(nurseryId));
    }
    @GetMapping("/{nurseryName}")
    public ResponseEntity<List<Nursery>> getNursery(@PathVariable String nurseryName){
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.getNursery(nurseryName));
    }
    @GetMapping("/nursery_list")
    public ResponseEntity<List<Nursery>> getNurseryList(){
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.getNurseryList());
    }
}
