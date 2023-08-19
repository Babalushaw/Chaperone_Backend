package chaperone.com.service;

import chaperone.com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee addEmployee(Employee employee);

    String deleteEmployee(long empId);

    Employee getEmployee(long empId);

    List<Employee> employeeList();
    Employee findByEmail(String email);
}
