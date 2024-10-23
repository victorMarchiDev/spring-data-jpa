package com.victorMarchiDev.spring_data.repositories;

import com.victorMarchiDev.spring_data.entities.Category;
import com.victorMarchiDev.spring_data.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
