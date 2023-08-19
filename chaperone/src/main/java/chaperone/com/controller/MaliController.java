package chaperone.com.controller;

import chaperone.com.model.Mali;
import chaperone.com.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/mali")
public class MaliController {
    @Autowired
    private MaliService maliService;
    @PostMapping("/add_mali")
    public ResponseEntity<Mali> addMali(@RequestBody Mali mali){
        return ResponseEntity.status(HttpStatus.CREATED).body(maliService.addMali(mali));
    }
    @DeleteMapping("/delete_mali/{maliId}")
    public ResponseEntity<String> deleteMali(@PathVariable long maliId){
        return ResponseEntity.status(HttpStatus.OK).body(maliService.deleteMali(maliId));
    }
    @GetMapping("/{maliId}")
    public ResponseEntity<Mali> getMali(@PathVariable long maliId){
        return ResponseEntity.status(HttpStatus.OK).body(maliService.getMali(maliId));
    }
    @GetMapping("/mali_list")
    public ResponseEntity<List<Mali>> getMaliList(){
        return ResponseEntity.status(HttpStatus.OK).body(maliService.getMaliList());
    }
}
