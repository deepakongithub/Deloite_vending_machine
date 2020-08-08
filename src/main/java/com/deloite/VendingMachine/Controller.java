package com.deloite.VendingMachine;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping
	ResponseEntity<?> test(){
		
		
		String message ="Hello Binod";
		
		return ResponseEntity.ok(message);
		
	}
}
