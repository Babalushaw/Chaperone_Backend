package chaperone.com.securityConfig;

import chaperone.com.model.Customer;
import chaperone.com.model.Employee;
import chaperone.com.model.Mali;
import chaperone.com.service.CustomerService;
import chaperone.com.service.EmployeeService;
import chaperone.com.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class  UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private MaliService maliService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer=customerService.findByEmail(email);
        Employee employee=employeeService.findByEmail(email);
        Mali mali=maliService.findByEmail(email);
        if (customer!=null) {
            return User.builder().username(customer.getEmail()).password(customer.getPassword()).roles("CUSTOMER").build();
        } else if (employee!=null) {
            return User.builder().username(employee.getEmail()).password(employee.getPassword()).roles(employee.getRole().toUpperCase()).build();
        } else if (maliService!=null) {
            return User.builder().username(mali.getEmailId()).password(mali.getPassword()).roles("MALI").build();
        }
        throw new UsernameNotFoundException("Invalid username");
    }
}
