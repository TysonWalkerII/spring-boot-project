package com.firstwebapp.FirstSpringBootDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FirstSpringBootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootDemoAppApplication.class, args);
	}

}
