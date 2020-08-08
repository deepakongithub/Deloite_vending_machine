package com.deloite.VendingMachine.service;

import java.util.ArrayList;

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
	
	public ArrayList<Coin> getCoins() {
		
		//returns the supported Coins  by the system
		ArrayList<Coin> changes = new ArrayList<Coin>();
		
	
		for (Coin c : Coin.values()) {
			changes.add(c);
	    }

		return changes;
 	}
	
}
