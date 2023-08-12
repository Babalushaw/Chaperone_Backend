package chaperone.com.repository;

import chaperone.com.dto.Pot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlotRepository extends JpaRepository<Pot,Long> {
}
