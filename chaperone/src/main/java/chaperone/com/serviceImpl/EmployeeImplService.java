package chaperone.com.serviceImpl;

import chaperone.com.dto.AddressDto;
import chaperone.com.dto.EmployeeDto;
import chaperone.com.exception.ServerNotFound;
import chaperone.com.model.Employee;
import chaperone.com.model.address.EmployeeAddress;
import chaperone.com.repository.EmployeeRepository;
import chaperone.com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImplService implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public String addEmployee(EmployeeDto employeeDto) throws ServerNotFound {
        try{
            Employee employee=new Employee();
            employee.setRole("ROLE_"+employeeDto.getRole().toUpperCase());
            employee.setEmail(employeeDto.getEmail());
            employee.setPassword(bCryptPasswordEncoder.encode(employeeDto.getPassword()));
            employee.setMobileNumber(employeeDto.getMobileNumber());
            employee.setDesignation(employeeDto.getDesignation());
            employee.setName(employeeDto.getName());
            employee.setImage(employeeDto.getImage());

            EmployeeAddress employeeAddress=new EmployeeAddress();
            AddressDto addressDto=employeeDto.getAddressDto();

            employeeAddress.setState(addressDto.getState());
            employeeAddress.setCity(addressDto.getCity());
            employeeAddress.setLocality(addressDto.getLocality());
            employeeAddress.setPinCode(addressDto.getPinCode());
            employee.setAddress(employeeAddress);

            employeeRepository.save(employee);
            return "Successfully added";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public String deleteEmployee(long empId) throws ServerNotFound {
        try{
            employeeRepository.deleteById(empId);
            return "Deleted Successfully";
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public Employee getEmployee(long empId) throws ServerNotFound {
        try{
            return employeeRepository.findById(empId).orElse(new Employee());
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }

    @Override
    public List<Employee> employeeList() throws ServerNotFound {
        try {
            return employeeRepository.findAll();
        }catch (Exception e){
            throw new ServerNotFound("server unavailable");
        }
    }


}
