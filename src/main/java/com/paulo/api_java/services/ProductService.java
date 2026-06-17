package com.paulo.api_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulo.api_java.entities.Product;
import com.paulo.api_java.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository repository;

	ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAll()
	{
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
