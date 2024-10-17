package com.victorMarchiDev.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorMarchiDev.spring_data.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
