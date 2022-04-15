package daao;

import daao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springdemo.entity.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;
    @RequestMapping("/list")
    public String customerList(Model theModel){
        List<Customer> customers = customerDAO.getCustomers();
        theModel.addAttribute("customers",customers);
        return "customer-list";
    }
}
