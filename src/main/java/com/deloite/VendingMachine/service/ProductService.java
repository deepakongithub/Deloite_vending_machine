package com.deloite.VendingMachine.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloite.VendingMachine.DTO.CoinDTO;
import com.deloite.VendingMachine.DTO.PurchaseDTO;
import com.deloite.VendingMachine.dao.ProductRepository;
import com.deloite.VendingMachine.exceptions.OutOfBudgetException;
import com.deloite.VendingMachine.model.Coin;
import com.deloite.VendingMachine.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	public List<Product> getAll() {
		final List<Product> products = new ArrayList<Product>();
		repository.findAll().forEach(product -> products.add(product));
		return products;
	}
	
	
	public Optional<Product> findById(Long id) {
		
		return  repository.findById(id);
	 
	}
	
	private boolean canYouBuy(Product product , Coin coin) {
		
		
		if(product.getPrice()> coin.getValue())
			throw new OutOfBudgetException(product.getName());
		
		return true;
	}
	
	
	private ArrayList<CoinDTO> getChange(Product product , Coin coin) {
		
		canYouBuy(product, coin);

		ArrayList<CoinDTO> changes = new ArrayList<CoinDTO>();
		
	
		for (Coin c : Coin.values()) {
			changes.add(new CoinDTO(c,0L));
	    }

		return changes;
 	}
	
	
	
	public PurchaseDTO buy(Product product , Coin coin) {
		
		
		PurchaseDTO purchaseDTO = new PurchaseDTO();
		
		purchaseDTO.setChange(getChange(product, coin));
		
		purchaseDTO.setProductName(product.getName());
		purchaseDTO.setPrice(product.getPrice());
		purchaseDTO.setProductCategory(product.getProductCategory());
		return purchaseDTO;
 		
		 
	}
}
