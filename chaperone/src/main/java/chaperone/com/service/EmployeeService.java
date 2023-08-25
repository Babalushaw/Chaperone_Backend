package chaperone.com.service;

import chaperone.com.dto.EmployeeDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    String addEmployee(EmployeeDto employeeDto) throws ServerNotFound;

    String deleteEmployee(long empId) throws ServerNotFound;

    Employee getEmployee(long empId) throws ServerNotFound;

    List<Employee> employeeList() throws ServerNotFound;
}
