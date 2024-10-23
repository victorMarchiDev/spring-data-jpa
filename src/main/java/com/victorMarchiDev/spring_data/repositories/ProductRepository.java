package com.victorMarchiDev.spring_data.repositories;

import com.victorMarchiDev.spring_data.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
