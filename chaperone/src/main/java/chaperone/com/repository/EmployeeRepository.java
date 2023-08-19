package chaperone.com.repository;

import chaperone.com.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
