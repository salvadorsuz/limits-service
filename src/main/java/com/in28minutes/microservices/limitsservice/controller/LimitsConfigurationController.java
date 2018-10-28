package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.beans.LimitConfiguration;
import com.in28minutes.microservices.limitsservice.configuration.LimitConfigProperties;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitConfigProperties limitConfigProps;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return limitConfigProps.getLimitConfiguration();
	}
}
