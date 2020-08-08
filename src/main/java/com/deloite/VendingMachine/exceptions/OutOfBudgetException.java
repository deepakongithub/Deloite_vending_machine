package com.deloite.VendingMachine.exceptions;

public class OutOfBudgetException extends RuntimeException {

	 public OutOfBudgetException(String productName) {
	        super(productName+" is out of budget");
	    }
	
}
