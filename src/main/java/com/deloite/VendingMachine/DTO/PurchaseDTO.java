package com.deloite.VendingMachine.DTO;

import java.util.ArrayList;

import com.deloite.VendingMachine.model.ProductCategory;

public class PurchaseDTO {
	private String productName;
	private Long price; //value in cents
 	private ProductCategory productCategory;
	private ArrayList<CoinDTO> change;
	
	
	
	public PurchaseDTO() {
		super();
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Long getPrice() {
		return price;
	}



	public void setPrice(Long price) {
		this.price = price;
	}



	public ProductCategory getProductCategory() {
		return productCategory;
	}



	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}



	public ArrayList<CoinDTO> getChange() {
		return change;
	}



	public void setChange(ArrayList<CoinDTO> change) {
		this.change = change;
	}


 
}
