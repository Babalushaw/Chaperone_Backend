package chaperone.com.serviceImpl;

import chaperone.com.model.Pot;
import chaperone.com.service.PotService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotServiceImpl implements PotService {
    @Override
    public Pot addPot(Pot pot) {
        return null;
    }

    @Override
    public String deletePot(long potId) {
        return null;
    }

    @Override
    public List<Pot> getPot(String  potName) {
        return null;
    }

    @Override
    public List<Pot> getPotList() {
        return null;
    }
}
