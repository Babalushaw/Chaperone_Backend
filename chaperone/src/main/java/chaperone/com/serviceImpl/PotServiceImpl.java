package chaperone.com.serviceImpl;

import chaperone.com.dto.PotDto;
import chaperone.com.exception.ServerNotFound;
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
    public String addPot(PotDto potDto) throws ServerNotFound {
        try{
            getPotFromPotDto(potDto);
            Pot pot=getPotFromPotDto(potDto);
            potRepository.save(pot);
            return "Pot added successfully";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public String deletePot(long potId) throws ServerNotFound {
        try{
            potRepository.deleteById(potId);
            return "Successfully deleted";
        }catch(Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public List<Pot> getPot(String  potName) throws ServerNotFound {
        try{
            return potRepository.findByName(potName);
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public List<Pot> getPotList() throws ServerNotFound {
        try{
            return potRepository.findAll();
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public Pot getPotFromPotDto(PotDto potDto) {
        try{
            Pot pot=new Pot();
            pot.setPotImage(pot.getPotImage());
            pot.setName(pot.getName());
            pot.setColour(potDto.getColour());
            pot.setSize(potDto.getSize());
            pot.setMaterial(potDto.getMaterial());
            pot.setPrice((potDto.getPrice()*potDto.getPriceIncreasePercentage())/100f);
            return pot;
        }catch (Exception e){
            return new Pot();
        }
    }
}
