package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ibm.service.HelloWorld;
import com.ibm.service.HelloWorldImpl;

@Configuration
@Import({EmployeeConfig.class,HelloWorldConfig.class,CustomerConfig.class})
public class AppConfig {

	
}
