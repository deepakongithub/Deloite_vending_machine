package com.deloite.VendingMachine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="COIN_INVENTORY")
public class CoinInventory {

 	private Coin coin;
	private Long quantity;
	
	
	
	public CoinInventory() {
		super();
	}
	
	
 
	@Id
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	public Coin getCoin() {
		return coin;
	}
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
	
	@NotNull
	@Column(name = "QUANTITY")
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
}
