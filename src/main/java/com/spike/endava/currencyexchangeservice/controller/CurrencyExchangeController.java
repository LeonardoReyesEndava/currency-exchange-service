package com.spike.endava.currencyexchangeservice.controller;

import com.spike.endava.currencyexchangeservice.bean.ExchangeValue;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		
		logger.info("retrieveExchangeValue called with {} to {}", from, to);

		ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to,
				BigDecimal.valueOf(65L));

		String port = environment.getProperty("local.server.port");
		exchangeValue.setEnvironment(port);

		return exchangeValue;
		
	}

}
