package com.paulo.api_java.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;
	
	private Set<Category> categories = new HashSet<>();
}
