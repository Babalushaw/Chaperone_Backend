package chaperone.com.repository;

import chaperone.com.dto.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant,Long> {
}
