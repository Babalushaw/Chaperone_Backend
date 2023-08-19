package chaperone.com.serviceImpl;

import chaperone.com.model.Employee;
import chaperone.com.repository.EmployeeRepository;
import chaperone.com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImplService implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(long empId) {
        return null;
    }

    @Override
    public Employee getEmployee(long empId) {
        return null;
    }

    @Override
    public List<Employee> employeeList() {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findAll().stream().filter(employee -> employee.getEmail().compareTo(email)==0).findAny().orElse(null);
    }
}
