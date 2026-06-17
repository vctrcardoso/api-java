package com.paulo.api_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulo.api_java.entities.Category;
import com.paulo.api_java.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository repository;

	CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	public List<Category> findAll()
	{
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
