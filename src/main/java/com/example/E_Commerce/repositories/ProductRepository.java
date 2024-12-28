package com.example.E_Commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.E_Commerce.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
