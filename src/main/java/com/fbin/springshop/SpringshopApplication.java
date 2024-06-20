package com.fbin.springshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class SpringshopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringshopApplication.class, args);
	}

}
