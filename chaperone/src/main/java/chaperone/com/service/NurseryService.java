package chaperone.com.service;

import chaperone.com.model.Nursery;

import java.util.List;

public interface NurseryService {
    Nursery addNursery(Nursery nursery);

    String deleteNursery(long nurseryId);

    List<Nursery> getNursery(String nurseryName);

    List<Nursery> getNurseryList();
}
