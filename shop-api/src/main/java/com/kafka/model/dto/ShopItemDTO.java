package com.kafka.model.dto;

import java.io.Serializable;

import com.kafka.model.ShopItem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopItemDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String productIdentifier;
	private Integer amount;
	private Float price;
	
	public static ShopItemDTO convert(ShopItem shopItem) {
		ShopItemDTO shopItemDTO = new ShopItemDTO();
		shopItemDTO.setProductIdentifier(
		shopItem.getProductIdentifier());
		shopItemDTO.setAmount(shopItem.getAmount());
		shopItemDTO.setPrice(shopItem.getPrice());
		return shopItemDTO;
	}
}
