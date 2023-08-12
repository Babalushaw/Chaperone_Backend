package chaperone.com.repository;

import chaperone.com.dto.Mali;
import chaperone.com.dto.Nursery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseryRepository extends JpaRepository<Nursery,Long> {
}
