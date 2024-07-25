package com.itc.jenskins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenskinsApplication {
	public static Logger logger = LoggerFactory.getLogger(JenskinsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JenskinsApplication.class, args);
	}

	@PostConstruct
	public void myMethod(){
		logger.info("Application statred");
	}
}
