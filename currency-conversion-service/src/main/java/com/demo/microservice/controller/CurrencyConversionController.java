package com.demo.microservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.dto.CurrencyConversionBean;
import com.demo.microservice.service.CurrencyConversionProxy;

@RestController
public class CurrencyConversionController {
	
	
	@Autowired
	private CurrencyConversionProxy proxy;
	
	@GetMapping("/currency-conversion/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConversion(@PathVariable("from") String from , @PathVariable("to") String to, @PathVariable("quantity") String quantity) {
		
		CurrencyConversionBean conversionBean =	proxy.retrieveCurrenct(from, to);
		conversionBean.setCovertedValue(conversionBean.getConversionMultiple().multiply(new BigDecimal(quantity)));
		return conversionBean;
	}

}
