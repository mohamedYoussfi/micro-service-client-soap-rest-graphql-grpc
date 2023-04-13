package ma.enset.accountservice.mappers;

import ma.enset.accountservice.model.Customer;
import ma.enset.customerservice.web.grpc.stub.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public Customer fromGrpcCustomerToCustomer(CustomerService.Customer source){
        return modelMapper.map(source,Customer.class);
    }
    public CustomerService.Customer fromCustomerToGrpcCustomer(Customer customer){
        return modelMapper.map(customer,CustomerService.Customer.Builder.class).build();
    }
    public Customer fromSoapCustomerToCustomer(ma.enset.customerservice.web.soap.Customer customer){
        return modelMapper.map(customer, Customer.class);
    }
    public ma.enset.customerservice.web.soap.Customer fromCustomerToSoapCustomer(Customer customer){
        return modelMapper.map(customer, ma.enset.customerservice.web.soap.Customer.class);
    }

}
