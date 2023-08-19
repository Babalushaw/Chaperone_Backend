package chaperone.com.addresRepository;

import chaperone.com.model.address.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,Long> {
}
