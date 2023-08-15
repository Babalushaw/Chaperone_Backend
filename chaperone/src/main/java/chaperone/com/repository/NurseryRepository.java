package chaperone.com.repository;

import chaperone.com.model.Nursery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseryRepository extends JpaRepository<Nursery,Long> {
}
