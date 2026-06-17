package com.paulo.api_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.api_java.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
