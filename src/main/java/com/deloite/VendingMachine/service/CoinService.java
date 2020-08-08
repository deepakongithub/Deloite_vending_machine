package com.deloite.VendingMachine.service;

import org.springframework.stereotype.Service;

import com.deloite.VendingMachine.exceptions.CoinNotFoundException;
import com.deloite.VendingMachine.model.Coin;

@Service
public class CoinService {

	
	public Coin isValidCoin(String string) {
		
		 for (Coin c : Coin.values()) {
		        if (c.name().equals(string)) {
		            return c;
		        }
		    }
			throw new CoinNotFoundException(string);
	}
}
