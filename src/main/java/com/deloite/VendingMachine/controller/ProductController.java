package com.deloite.VendingMachine.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deloite.VendingMachine.DTO.PurchaseDTO;
import com.deloite.VendingMachine.exceptions.CoinNotFoundException;
import com.deloite.VendingMachine.exceptions.OutOfBudgetException;
import com.deloite.VendingMachine.exceptions.ProductNotFoundException;
import com.deloite.VendingMachine.model.Coin;
import com.deloite.VendingMachine.model.Product;
import com.deloite.VendingMachine.service.CoinService;
import com.deloite.VendingMachine.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	CoinService coinService;

	@GetMapping("Products")
	ResponseEntity<?> products() {

		// returns the available products
		return ResponseEntity.ok(productService.getAll());

	}

	@GetMapping("Products/buy/{id}/{_coin}")
	ResponseEntity<?> buyProduct(@PathVariable Long id, @PathVariable String _coin) {

		Coin coin = coinService.isValidCoin(_coin);

		System.out.println(coin.getValue());

		Optional<Product> product;
		product = productService.findById(id);
		//System.out.println(product.get().getName()+" =name");
		if (!product.isPresent()) {
			throw new ProductNotFoundException(id);

		}

		PurchaseDTO purchaseDTO = productService.buy(product.get(), coin);

		// returns the available products
		return ResponseEntity.ok(purchaseDTO);

	}

	@ExceptionHandler({ CoinNotFoundException.class })
	public ResponseEntity<String> handleCoinNotFoundException(CoinNotFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}

	@ExceptionHandler({ ProductNotFoundException.class })
	public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}

	@ExceptionHandler({ OutOfBudgetException.class })
	public ResponseEntity<String> handleOutOfBudgetException(OutOfBudgetException e) {
		return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body(e.getMessage());
	}

}
