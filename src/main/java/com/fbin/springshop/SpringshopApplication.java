package com.fbin.springshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class SpringshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringshopApplication.class, args);
	}

}
