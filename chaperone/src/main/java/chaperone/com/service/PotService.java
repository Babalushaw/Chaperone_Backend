package chaperone.com.service;

import chaperone.com.model.Pot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PotService {
    Pot addPot(Pot pot);

    String deletePot(long potId);

    List<Pot> getPot(String potName);

    List<Pot> getPotList();
}
