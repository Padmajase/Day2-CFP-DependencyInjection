package com.bridgelabz.springconcept;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);
	public static void main(String[] args) {
		logger.debug("welcome to spring concepts !");
		SpringApplication.run(SpringConceptApplication.class, args);

	}

}
