package chaperone.com.repository;

import chaperone.com.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("SELECT c FROM Customer c WHERE c.mobileNumber = :mobile")
    public Customer findByMobile(@Param("mobile") String mobile);
    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    public Customer findByEmail(@Param("email") String email);

}
