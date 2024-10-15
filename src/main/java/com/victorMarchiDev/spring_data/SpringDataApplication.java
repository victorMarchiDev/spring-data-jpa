package com.victorMarchiDev.spring_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringDataApplication {
	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

}
