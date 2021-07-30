package com.mrbarin.microservicios.retrievetransactionuser.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RetrieveTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetrieveTransactionApplication.class, args);
	}

}
