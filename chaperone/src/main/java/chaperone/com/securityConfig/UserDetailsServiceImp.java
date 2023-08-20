package chaperone.com.securityConfig;

import chaperone.com.dto.User;
import chaperone.com.model.Customer;
import chaperone.com.model.Employee;
import chaperone.com.model.Mali;
import chaperone.com.service.CustomerService;
import chaperone.com.service.EmployeeService;
import chaperone.com.service.MaliService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Slf4j
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
        log.info("customer");
        Employee employee=employeeService.findByEmail(email);
        log.info("employee");
        Mali mali=maliService.findByEmail(email);
        log.info("mali");
        User user=new User();
        CustomUserDetails customUserDetails=new CustomUserDetails();
        try{
            user.setRole("CUSTOMER");
            user.setEmail(email);
            user.setPassword(customer.getPassword());
            customUserDetails.setUser(user);
            return customUserDetails;
        }catch (Exception e){
            log.info("not a customer");
        }
        try{
            user.setRole(employee.getRole().toUpperCase());
            log.info(employee.getEmail());
            user.setEmail(email);
            user.setPassword(employee.getPassword());
            customUserDetails.setUser(user);
            return customUserDetails;
        }catch (Exception e){
            log.info("not a employee");
        }
        try{
            user.setRole("MALI");
            user.setEmail(email);
            log.info(email);
            user.setPassword(mali.getPassword());
            customUserDetails.setUser(user);
            return customUserDetails;
        }catch (Exception e){
            log.info("not a mali");
        }
        throw new UsernameNotFoundException("Invalid username");
    }
}
