package com.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kafka.model.ShopReport;

public interface ReportRepository extends JpaRepository<ShopReport, Long>{

	@Modifying
	@Query(value = "update shop_report "
			+ "set amount = amount + 1 "
			+ "where identifier = :shopStatus",
			nativeQuery = true)
	void incrementShopStatus(String shopStatus);
}
