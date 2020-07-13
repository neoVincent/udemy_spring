package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringIn5StepsApplication {

	// dependency injection
	// loose coupling

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsApplication.class);


	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);

		PersonDAO personDAO =
				applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 =
				applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO.getJdbcConnection());
	}

}
