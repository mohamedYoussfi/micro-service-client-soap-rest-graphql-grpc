package ma.enset.accountservice;

import ma.enset.customerservice.web.soap.CustomerSoapService;
import ma.enset.customerservice.web.soap.CustomerSoapServiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
  @Bean
    public CustomerSoapService customerSoapService(){
        return new CustomerSoapServiceService().getCustomerSoapServicePort();
    }
}
