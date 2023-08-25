package chaperone.com.serviceImpl;

import chaperone.com.dto.AddressDto;
import chaperone.com.dto.NurseryDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Nursery;
import chaperone.com.model.address.NurseryAddress;
import chaperone.com.repository.NurseryRepository;
import chaperone.com.service.NurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseryServiceImpl implements NurseryService {
    @Autowired
    private NurseryRepository nurseryRepository;
    @Override
    public String addNursery(NurseryDto nurseryDto) throws ServerNotFound {
       try{
           Nursery nursery=new Nursery();
           nursery.setEmail(nurseryDto.getEmail());
           nursery.setMobileNumber(nurseryDto.getContactPerson());
           nursery.setMobileNumber(nurseryDto.getMobileNumber());
           nursery.setNurseryName(nurseryDto.getNurseryName());

           NurseryAddress nurseryAddress=new NurseryAddress();
           AddressDto addressDto=nurseryDto.getAddressDto();

           nurseryAddress.setPinCode(addressDto.getPinCode());
           nurseryAddress.setLocality(addressDto.getLocality());
           nurseryAddress.setCity(addressDto.getCity());
           nurseryAddress.setState(addressDto.getState());

           nursery.setAddress(nurseryAddress);
           nurseryRepository.save(nursery);
           return "Nursery added successfully";
       }catch (Exception e){
           throw new ServerNotFound("server unavailable");
       }
    }

    @Override
    public String deleteNursery(long nurseryId) throws ServerNotFound {
        try{
            nurseryRepository.deleteById(nurseryId);
            return "deleted successfully";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public List<Nursery> getNursery(String nurseryName) throws ServerNotFound {
       try{
           return nurseryRepository.findByName(nurseryName);
       }catch (Exception e){
           throw new ServerNotFound("server unavailable");
       }
    }

    @Override
    public List<Nursery> getNurseryList() throws ServerNotFound {
        try{
            return nurseryRepository.findAll();
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }
}
