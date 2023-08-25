package chaperone.com.service;

import chaperone.com.dto.MaliDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Mali;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaliService {
    String addMali(MaliDto maliDto) throws ServerNotFound;

    String deleteMali(long maliId) throws ServerNotFound;

    Mali getMali(long maliId) throws ServerNotFound;

    List<Mali> getMaliList() throws ServerNotFound;
}
