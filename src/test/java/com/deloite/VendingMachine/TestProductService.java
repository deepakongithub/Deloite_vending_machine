package com.deloite.VendingMachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.deloite.VendingMachine.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class TestProductService {

	
	 @InjectMocks
	 ProductService  productService;
	 
	 
	 
	 	
	 	@Test
		public void testProducts() {
			//
	 	   assertEquals(11, productService.getAll());
	 	}
}
