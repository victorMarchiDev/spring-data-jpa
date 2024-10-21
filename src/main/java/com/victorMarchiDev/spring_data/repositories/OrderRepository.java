package com.victorMarchiDev.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorMarchiDev.spring_data.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
