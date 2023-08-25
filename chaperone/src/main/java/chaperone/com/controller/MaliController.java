package chaperone.com.controller;

import chaperone.com.dto.MaliDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Mali;
import chaperone.com.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/admin/mali")
public class MaliController {
    @Autowired
    private MaliService maliService;
    @PostMapping("/add_mali")
    public ResponseEntity<String> addMali(@RequestBody MaliDto maliDto) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.CREATED).body(maliService.addMali(maliDto));
    }
    @DeleteMapping("/delete_mali/{maliId}")
    public ResponseEntity<String> deleteMali(@PathVariable long maliId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(maliService.deleteMali(maliId));
    }
    @GetMapping("/{maliId}")
    public ResponseEntity<Mali> getMali(@PathVariable long maliId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(maliService.getMali(maliId));
    }
    @GetMapping("/mali_list")
    public ResponseEntity<List<Mali>> getMaliList() throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(maliService.getMaliList());
    }
}
