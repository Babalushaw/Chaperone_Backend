package chaperone.com.controller;

import chaperone.com.dto.EmployeeDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Employee;
import chaperone.com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("ADMIN")
@RequestMapping("/chaperone/admin/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add_employee")
    public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employeeDto));
    }
    @DeleteMapping("/delete_employee/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long empId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.deleteEmployee(empId));
    }
    @GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long empId) throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(empId));
    }
    @GetMapping("/employee_list")
    public ResponseEntity<List<Employee>> employeeList() throws ServerNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.employeeList());
    }
}
