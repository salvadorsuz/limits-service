package com.in28minutes.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.microservices.limitsservice.beans.LimitConfiguration;

@Configuration
//@PropertySource("classpath:limit-config.properties")
@ConfigurationProperties(prefix = "limits-service")
public class LimitConfigProperties {
	
	private LimitConfiguration limitConfiguration;

	public LimitConfiguration getLimitConfiguration() {
		return limitConfiguration;
	}

	public void setLimitConfiguration(LimitConfiguration limitConfiguration) {
		this.limitConfiguration = limitConfiguration;
	}

	
}
