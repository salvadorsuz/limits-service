package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.beans.LimitConfiguration;
import com.in28minutes.microservices.limitsservice.configuration.LimitConfigProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitConfigProperties limitConfigProps;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return limitConfigProps.getLimitConfiguration();
	}
	
	@GetMapping("/fault-tolerance-limits")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguration retrieveLimit() {
		throw new RuntimeException("ERROR!!!");
	}
	
	public LimitConfiguration fallbackRetrieveConfiguration() {
		LimitConfiguration out = new LimitConfiguration();
		out.setMinimun(1);
		out.setMaximun(16);
		
		return out;
	}
}
