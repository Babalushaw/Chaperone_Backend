package chaperone.com.serviceImpl;

import chaperone.com.model.Mali;
import chaperone.com.repository.MaliRepository;
import chaperone.com.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaliServiceImpl implements MaliService {
    @Autowired
    private MaliRepository maliRepository;
    @Override
    public Mali addMali(Mali mali) {
        return null;
    }

    @Override
    public String deleteMali(long maliId) {
        return null;
    }

    @Override
    public Mali getMali(long maliId) {
        return null;
    }

    @Override
    public List<Mali> getMaliList() {
        return null;
    }

}
