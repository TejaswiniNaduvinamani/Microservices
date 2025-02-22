package com.demo.microservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.microservice.dto.CurrencyConversionBean;

@FeignClient(name="zuul-api-gateway")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyConversionProxy {
	
	@GetMapping("/currency-exchange-service/currency-exchange/{from}/to/{to}")
	public CurrencyConversionBean retrieveCurrenct(@PathVariable("from") String from, @PathVariable("to") String to);
	
	
}
