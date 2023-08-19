package chaperone.com.addresRepository;

import chaperone.com.model.address.NurseryAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseryAddressRepository extends JpaRepository<NurseryAddress,Long> {
}
