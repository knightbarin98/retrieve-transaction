package com.mrbarin.microservicios.retrievetransactionuser.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Config {

	@Bean
	public ObjectMapper mapper() {
		return new ObjectMapper();
	}
}
