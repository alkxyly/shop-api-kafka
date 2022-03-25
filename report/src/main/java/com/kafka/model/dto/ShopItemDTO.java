package com.kafka.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopItemDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String productIdentifier;
	private Integer amount;
	private Float price;
	
}
