package com.javaguides.springboot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {
// http://localhost:8080/api/welcome
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
