package chaperone.com.serviceImpl;

import chaperone.com.dto.AddressDto;
import chaperone.com.dto.MaliDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Mali;
import chaperone.com.model.address.MaliAddress;
import chaperone.com.repository.MaliRepository;
import chaperone.com.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaliServiceImpl implements MaliService {
    @Autowired
    private MaliRepository maliRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public String addMali(MaliDto maliDto) throws ServerNotFound {
        try {
            Mali mali= new Mali();
            mali.setMaliName(maliDto.getMaliName());
            mali.setEmail(maliDto.getEmail());
            mali.setPassword(bCryptPasswordEncoder.encode(maliDto.getPassword()));
            mali.setMobileNumber(maliDto.getMobileNumber());
            mali.setWhatsappNumber(maliDto.getWhatsappNumber());
            mali.setImage(maliDto.getImage());

            MaliAddress maliAddress=new MaliAddress();
            AddressDto addressDto=maliDto.getAddressDto();

            maliAddress.setLocality(addressDto.getLocality());
            maliAddress.setState(addressDto.getState());
            maliAddress.setCity(addressDto.getCity());
            maliAddress.setPinCode(addressDto.getPinCode());
            mali.setAddress(maliAddress);
            maliRepository.save(mali);
            return "Added successfully";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public String deleteMali(long maliId) throws ServerNotFound {
        try {
            maliRepository.deleteById(maliId);
            return "deleted successfully";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public Mali getMali(long maliId) throws ServerNotFound {
        try{
            return maliRepository.findById(maliId).orElse(new Mali());
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public List<Mali> getMaliList() throws ServerNotFound {
        try {
            return maliRepository.findAll();
        }catch(Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

}
