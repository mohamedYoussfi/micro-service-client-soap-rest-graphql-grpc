package ma.enset.accountservice.feign;

import ma.enset.accountservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api", value = "customer-rest-client")
public interface CustomerRestClient {
    @GetMapping("/customers")
    List<Customer> findCustomers();
    @GetMapping("/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);
}
