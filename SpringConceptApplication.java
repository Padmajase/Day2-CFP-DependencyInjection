package com.bridgelabz.springconcept;

import com.bridgelabz.springconcept.component.DemoBean;
import com.bridgelabz.springconcept.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);
	public static void main(String[] args) {
		logger.debug("welcome to spring concepts !");
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		logger.debug("Checking context: {}", context.getBean(DemoBean.class));
		logger.debug("*** Example using @Autowire annotation on property *** ");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.seteName("Spring Framework guru ");
		employeeBean.showEmployeeDetails();
	}

}
