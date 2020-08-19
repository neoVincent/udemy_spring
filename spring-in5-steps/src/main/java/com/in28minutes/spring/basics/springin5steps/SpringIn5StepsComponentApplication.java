package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.in28minutes.spring.basics.componentscan", "com.in28minutes.spring.basics.springin5steps"})
public class SpringIn5StepsComponentApplication {

	// dependency injection
	// loose coupling

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);


	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsComponentApplication.class, args);

		ComponentDAO componentDAO =
				applicationContext.getBean(ComponentDAO.class);

		PersonDAO personDAO =
				applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", personDAO);

	}

}
