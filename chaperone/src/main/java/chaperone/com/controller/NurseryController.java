package chaperone.com.controller;

import chaperone.com.dto.NurseryDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Nursery;
import chaperone.com.service.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaperone/admin/nursery")
public class NurseryController {
    @Autowired
    private NurseryService nurseryService;
    @PostMapping("/add_nursery")
    public ResponseEntity<String> addNursery(@RequestBody NurseryDto nurseryDto) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.CREATED).body(nurseryService.addNursery(nurseryDto));
    }
    @DeleteMapping("/{nurserId}")
    public ResponseEntity<String> deleteNurser(@PathVariable long nurseryId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.deleteNursery(nurseryId));
    }
    @GetMapping("/{nurseryName}")
    public ResponseEntity<List<Nursery>> getNursery(@PathVariable String nurseryName) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.getNursery(nurseryName));
    }
    @GetMapping("/nursery_list")
    public ResponseEntity<List<Nursery>> getNurseryList() throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(nurseryService.getNurseryList());
    }
}
