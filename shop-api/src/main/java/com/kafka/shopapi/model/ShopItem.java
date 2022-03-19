package com.kafka.shopapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "shop_item")
public class ShopItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "product_identifier")
	private String productIdentifier;
	private Integer amount;
	private Float price;
	
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	
	public static ShopItem convert(ShopItemDTO shopItemDTO) {
		ShopItem shopItem = new ShopItem();
		shopItem.setProductIdentifier(
				shopItemDTO.getProductIdentifier());
		shopItem.setAmount(shopItemDTO.getAmount());
		shopItem.setPrice(shopItemDTO.getPrice());
		return shopItem;
	}
	
}