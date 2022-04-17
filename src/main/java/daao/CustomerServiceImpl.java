package daao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springdemo.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDAO customerDAO;


    @Override
    @Transactional
    public List<Customer> getCustomers() {
    return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer updateCustomer(int theId) {
        return customerDAO.updateCustomer(theId);


    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}
