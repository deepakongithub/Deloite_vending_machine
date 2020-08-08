package com.deloite.VendingMachine.DTO;

import com.deloite.VendingMachine.model.Coin;

public class CoinDTO {
	private Coin coin;
	private Long quantity;
	
	
	
	
	public CoinDTO() {
		super();
 	}
	public CoinDTO(Coin coin, Long quantity) {
		super();
		this.coin = coin;
		this.quantity = quantity;
	}
	public Coin getCoin() {
		return coin;
	}
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
