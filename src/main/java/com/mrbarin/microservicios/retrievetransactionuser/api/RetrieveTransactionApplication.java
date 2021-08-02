package com.mrbarin.microservicios.retrievetransactionuser.api;

import org.slf4j.Marker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class RetrieveTransactionApplication {

	public static void main(String[] args) {
		log.info("Application start");
		SpringApplication.run(RetrieveTransactionApplication.class, args);
	}

}
