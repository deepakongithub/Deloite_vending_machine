package com.deloite.VendingMachine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	
	public void buy(Product product , Coin coin) {
		
		
		canYouBuy(product, coin);
 		
		 
	}
}
