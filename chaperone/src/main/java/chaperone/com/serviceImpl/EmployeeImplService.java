package chaperone.com.serviceImpl;

import chaperone.com.model.Employee;
import chaperone.com.service.EmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImplService implements EmployeeService {
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
}