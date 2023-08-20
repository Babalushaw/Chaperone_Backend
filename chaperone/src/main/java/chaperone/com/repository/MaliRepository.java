package chaperone.com.repository;

import chaperone.com.model.Employee;
import chaperone.com.model.Mali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface MaliRepository extends JpaRepository<Mali,Long> {
    @Query("SELECT m FROM Mali m WHERE m.mobileNumber = :mobile")
    public Mali findByMobile(@Param("mobile") String mobile);
    @Query("SELECT m FROM Mali m WHERE m.email = :email")
    public Mali findByEmail(@Param("email") String email);
}
