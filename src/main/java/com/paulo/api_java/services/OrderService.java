package com.paulo.api_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulo.api_java.entities.Order;
import com.paulo.api_java.repositories.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository repository;

	OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> findAll()
	{
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
