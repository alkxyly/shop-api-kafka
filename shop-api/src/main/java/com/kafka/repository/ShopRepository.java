package com.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
	
	Shop findByIdentifier(String identifier);
}
