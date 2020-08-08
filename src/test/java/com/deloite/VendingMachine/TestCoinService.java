package com.deloite.VendingMachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.deloite.VendingMachine.service.CoinService;

@RunWith(MockitoJUnitRunner.class)
public class TestCoinService {
	
	 @InjectMocks
	 CoinService  coinService;
	 
	 
	 
	 	
	 	@Test
		public void testGetCoins() {
			// returns the supported Coins  by the system system support 4 types of coin
	 	   assertEquals(4, coinService.getCoins().size());
	 	}

}
