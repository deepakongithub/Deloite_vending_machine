package com.deloite.VendingMachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloite.VendingMachine.service.CoinService;

@RestController
public class CoinController {

	
	@Autowired
	CoinService coinService;
	
	@GetMapping("Conis")
	ResponseEntity<?> coins(){
		
	// returns the supported Coins  by the system		
		return ResponseEntity.ok(coinService.getCoins());
		
	}
}
