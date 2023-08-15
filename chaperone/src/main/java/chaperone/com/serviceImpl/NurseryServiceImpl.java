package chaperone.com.serviceImpl;

import chaperone.com.model.Nursery;
import chaperone.com.service.NurseryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseryServiceImpl implements NurseryService {
    @Override
    public Nursery addNursery(Nursery nursery) {
        return null;
    }

    @Override
    public String deleteNursery(long nurseryId) {
        return null;
    }

    @Override
    public List<Nursery> getNursery(String nurseryName) {
        return null;
    }

    @Override
    public List<Nursery> getNurseryList() {
        return null;
    }
}
