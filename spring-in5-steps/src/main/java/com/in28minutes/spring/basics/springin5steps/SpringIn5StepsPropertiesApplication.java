package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	// dependency injection
	// loose coupling

	public static void main(String[] args) {


		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsPropertiesApplication.class, args);
		SomeExternalService service =
				applicationContext.getBean(SomeExternalService.class);
		System.out.println(service.returnServiceURL());


	}

}
