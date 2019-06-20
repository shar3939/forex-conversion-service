/**
 * 
 */
package com.forex.conversion.proxy;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shar939
 *
 */
public class FallbackForExchangeRates {

	@RequestMapping(value = "/forex/from/{from}/to/{to}")
	public BigDecimal getForex(@PathVariable(name = "from") String from, @PathVariable(name = "to") String to ) {
		return new BigDecimal(1);
	}
}
