package com.victorMarchiDev.spring_data.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.victorMarchiDev.spring_data.entities.User;
import com.victorMarchiDev.spring_data.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "232131", "213313");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "256464", "545333");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
