package chaperone.com.service;

import chaperone.com.model.Mali;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaliService {
    Mali addMali(Mali mali);

    String deleteMali(long maliId);

    Mali getMali(long maliId);

    List<Mali> getMaliList();
    Mali findByEmail(String email);
}
