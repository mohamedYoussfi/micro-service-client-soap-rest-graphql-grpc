package ma.enset.accountservice;

import ma.enset.customerservice.web.soap.Customer;
import ma.enset.customerservice.web.soap.CustomerSoapService;
import ma.enset.customerservice.web.soap.CustomerSoapServiceService;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomerSoapService customerSoapService=new CustomerSoapServiceService().getCustomerSoapServicePort();
        List<Customer> customers = customerSoapService.customerList();
        customers.forEach(c->{
            System.out.println(c.getFirstName());
            System.out.println(c.getEmail());
            System.out.println("-----------");
        });
    }
}
