package com.demo.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.dto.LimitConfigurationDTO;

@RestController
public class LimitServiceController {
	
	@Autowired
	private LimitConfiguration configuration;
	
	@GetMapping("/limits")
	public LimitConfigurationDTO limitService() {
		return new LimitConfigurationDTO(configuration.getMaximum(), configuration.getMinimum());
	}

}
