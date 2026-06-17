package com.paulo.api_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.api_java.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
