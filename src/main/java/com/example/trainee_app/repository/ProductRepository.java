package com.example.trainee_app.repository;

import com.example.trainee_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Custom query: check if a product name already exists
    boolean existsByProductName(String productName);
}