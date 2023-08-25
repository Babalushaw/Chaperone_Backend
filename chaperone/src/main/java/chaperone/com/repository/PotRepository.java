package chaperone.com.repository;

import chaperone.com.model.Nursery;
import chaperone.com.model.Pot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PotRepository extends JpaRepository<Pot,Long> {
    @Query("SELECT p FROM Pot p WHERE p.name = :name")
    public List<Pot> findByName(@Param("name") String name);
}
