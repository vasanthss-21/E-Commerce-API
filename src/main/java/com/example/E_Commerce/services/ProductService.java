package com.example.E_Commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.models.Product;
import com.example.E_Commerce.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
	public List<Product> getAllProducts(){
		return productrepository.findAll();
	}
}
