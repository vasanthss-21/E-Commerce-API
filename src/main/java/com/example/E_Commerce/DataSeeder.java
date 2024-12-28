package com.example.E_Commerce;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.E_Commerce.models.Product;
import com.example.E_Commerce.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	    if (productRepository.count() == 0) {
	        List<Product> products = Arrays.asList(
	            new Product(
	                "Samsung Galaxy S23",
	                69999.00,
	                "Latest model with 256GB storage and 8GB RAM",
	                4.5,
	                "Mobile Phone",
	                "Samsung Store",
	                150,
	                420
	            ),
	            new Product(
	                "Apple iPhone 15",
	                129999.00,
	                "Flagship phone with 128GB storage and A17 Bionic chip",
	                4.8,
	                "Mobile Phone",
	                "Apple Store",
	                100,
	                530
	            ),
	            new Product(
	                "Casio G-Shock",
	                9999.00,
	                "Shock-resistant digital watch with 200m water resistance",
	                4.6,
	                "Watch",
	                "Casio India",
	                300,
	                210
	            ),
	            new Product(
	                "Fossil Gen 6 Smartwatch",
	                22999.00,
	                "Smartwatch with heart rate monitoring and GPS",
	                4.2,
	                "Watch",
	                "Fossil Store",
	                120,
	                190
	            ),
	            new Product(
	                "Nike Dri-FIT T-Shirt",
	                1999.00,
	                "Comfortable sports t-shirt with sweat-wicking fabric",
	                4.4,
	                "T-Shirt",
	                "Nike Store",
	                500,
	                150
	            ),
	            new Product(
	                "Adidas Originals T-Shirt",
	                1799.00,
	                "Casual wear t-shirt with iconic 3-stripe design",
	                4.3,
	                "T-Shirt",
	                "Adidas Store",
	                400,
	                130
	            ),
	            new Product(
	                "OnePlus Nord CE 3",
	                25999.00,
	                "Mid-range phone with 128GB storage and 12GB RAM",
	                4.3,
	                "Mobile Phone",
	                "OnePlus Store",
	                200,
	                300
	            )
	        );

	        productRepository.saveAll(products);
	        System.out.println("Demo data seeded");
	    }
	}

}
