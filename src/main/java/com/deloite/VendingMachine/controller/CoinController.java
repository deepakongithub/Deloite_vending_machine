package com.deloite.VendingMachine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloite.VendingMachine.model.Coin;

@RestController
public class CoinController {

	
	@GetMapping("Conis")
	ResponseEntity<?> coins(){
		
	// returns the supported Coins  by the system		
		return ResponseEntity.ok(Coin.values());
		
	}
}
