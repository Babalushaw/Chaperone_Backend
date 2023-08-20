package chaperone.com.securityConfig;

import chaperone.com.model.Employee;
import chaperone.com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitialAdminSetup implements CommandLineRunner {
    @Value("${admin.password}")
    private String password;
    @Value("${admin.email}")
    private String email;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (employeeRepository.count() == 0) {
            Employee employee=new Employee();
            employee.setEmail(email);
            employee.setRole("ROLE_ADMIN");
            String hashedPassword = passwordEncoder.encode(password);
            employee.setPassword(hashedPassword);
            employeeRepository.save(employee);
        }
    }
}

