package com.kafka.model.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String identifier;
	private LocalDate dateShop;
	private String status;
	private List<ShopItemDTO> items = new ArrayList<>();
}
