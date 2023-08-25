package chaperone.com.service;

import chaperone.com.dto.PotDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Pot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PotService {
    String addPot(PotDto potDto) throws ServerNotFound;

    String deletePot(long potId) throws ServerNotFound;

    List<Pot> getPot(String potName) throws ServerNotFound;

    List<Pot> getPotList() throws ServerNotFound;
    Pot getPotFromPotDto(PotDto potDto);
}
