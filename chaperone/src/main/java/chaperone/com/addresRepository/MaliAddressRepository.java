package chaperone.com.addresRepository;

import chaperone.com.model.address.MaliAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaliAddressRepository extends JpaRepository<MaliAddress, Long> {
}
