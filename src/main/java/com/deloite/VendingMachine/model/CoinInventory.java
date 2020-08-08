package com.deloite.VendingMachine.model;

public class CoinInventory {

	private Coin coin;
	private Long quantity;
	
	
	
	public CoinInventory() {
		super();
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
