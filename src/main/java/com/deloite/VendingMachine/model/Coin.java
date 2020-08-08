package com.deloite.VendingMachine.model;

public enum Coin {

	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	private Coin(int value) {
		this.value = value;
	}

	private final int value;

	public int getValue() {
		return value;
	}

}
