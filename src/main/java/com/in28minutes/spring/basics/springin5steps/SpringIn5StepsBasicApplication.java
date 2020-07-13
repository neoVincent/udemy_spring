package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	// dependency injection
	// loose coupling

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		System.out.println(result);
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch.binarySearch(new int[]{12,4,6},3);
		System.out.println(result);
	}

}
