package com.kafka.controller;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.dto.ShopReportDTO;
import com.kafka.repository.ReportRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/shop_report")
@RequiredArgsConstructor
public class ShopReportController {

	private final ReportRepository reportRepository;
	
	@GetMapping
	public List<ShopReportDTO> getShopReport() {
		return reportRepository.findAll()
				.stream()
				.map(shop -> ShopReportDTO.convert(shop))
				.collect(Collectors.toList());
	}
}
