package chaperone.com.repository;

import chaperone.com.model.Employee;
import chaperone.com.model.Nursery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NurseryRepository extends JpaRepository<Nursery,Long> {
    @Query("SELECT n FROM Nursery n WHERE n.nurseryName = :nurseryName")
    public List<Nursery> findByName(@Param("nurseryName") String nurseryName);
}
