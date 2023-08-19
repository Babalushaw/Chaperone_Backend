package chaperone.com.serviceImpl;

import chaperone.com.model.Pot;
import chaperone.com.repository.PotRepository;
import chaperone.com.service.PotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotServiceImpl implements PotService {
    @Autowired
    private PotRepository potRepository;
    @Override
    public Pot addPot(Pot pot) {
        try{
            return potRepository.save(pot);
        }catch (Exception e){
            return null;
        }
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
