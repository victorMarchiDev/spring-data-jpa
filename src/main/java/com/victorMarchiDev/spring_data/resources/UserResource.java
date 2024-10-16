package com.victorMarchiDev.spring_data.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorMarchiDev.spring_data.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Pedro", "pedro@gmail.com", "99999", "123434");
		return ResponseEntity.ok().body(u);
	}
}
