package daao;
import org.springframework.stereotype.Service;
import springdemo.entity.Customer;

import java.util.List;
@Service
public interface CustomerDAO {

    List<Customer> getCustomers();

}