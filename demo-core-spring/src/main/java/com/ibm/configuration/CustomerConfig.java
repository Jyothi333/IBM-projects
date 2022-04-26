package com.ibm.configuration;

import com.ibm.service.Customer;
import com.ibm.service.CustomerImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    
    @Bean(name="customerBean")
    public Customer customer() {
        return new CustomerImpl();
    }
}
