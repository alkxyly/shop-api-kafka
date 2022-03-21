package com.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafka.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByIdentifier(String identifier);
}
