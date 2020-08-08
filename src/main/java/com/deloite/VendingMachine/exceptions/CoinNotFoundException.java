package com.deloite.VendingMachine.exceptions;

public class CoinNotFoundException extends RuntimeException{

	 public CoinNotFoundException(String coin) {
	        super("Coin  not found : " + coin);
	    }
}
