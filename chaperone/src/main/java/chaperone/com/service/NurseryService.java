package chaperone.com.service;

import chaperone.com.dto.NurseryDto;
import chaperone.com.model.Nursery;

import java.util.List;

public interface NurseryService {
    Nursery addNursery(NurseryDto nurseryDto);

    String deleteNursery(long nurseryId);

    List<Nursery> getNursery(String nurseryName);

    List<Nursery> getNurseryList();
}
