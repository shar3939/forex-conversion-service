/**
 * 
 */
package com.forex.conversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forex.conversion.proxy.ExchangeFeignClient;

/**
 * @author shar939
 *
 */
@RestController
public class ConversionController {

	@Autowired
	ExchangeFeignClient exchangeFeignClient;
	
	@RequestMapping(value = "/forex/from/{from}/to/{to}/quantity/{quantity}")
	public BigDecimal conversionValue (@PathVariable(name = "from") String from, 
			@PathVariable(name = "to") String to, 
			@PathVariable(name = "quantity") BigDecimal quantity) {
		
		BigDecimal exchangeValue = exchangeFeignClient.getForex(from, to);
		BigDecimal conversionValue = exchangeValue.multiply(quantity);  
		
		return conversionValue; 
		
	}
}
