package com.crixus.demoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {



		//SpringApplication.run(DemoApplication.class, args);
		/* may be here we need to create container */

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);




		Dev developer = context.getBean(Dev.class);

		developer.build();



	}



}
