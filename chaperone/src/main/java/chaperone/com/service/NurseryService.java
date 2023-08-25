package chaperone.com.service;

import chaperone.com.dto.NurseryDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Nursery;

import java.util.List;

public interface NurseryService {
    String addNursery(NurseryDto nurseryDto) throws ServerNotFound;

    String deleteNursery(long nurseryId) throws ServerNotFound;

    List<Nursery> getNursery(String nurseryName) throws ServerNotFound;

    List<Nursery> getNurseryList() throws ServerNotFound;
}
