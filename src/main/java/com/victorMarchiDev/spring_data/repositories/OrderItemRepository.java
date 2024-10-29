package com.victorMarchiDev.spring_data.repositories;

import com.victorMarchiDev.spring_data.entities.OrderItem;
import com.victorMarchiDev.spring_data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
