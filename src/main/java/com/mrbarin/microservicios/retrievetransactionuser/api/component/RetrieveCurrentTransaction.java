package com.mrbarin.microservicios.retrievetransactionuser.api.component;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrbarin.microservicios.retrievetransactionuser.api.client.RetrieveCurrentTransactionClient;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RetrieveCurrentTransaction {
	
	@Autowired
	private RetrieveCurrentTransactionClient client;
	
	public Optional<ResponseTransactions> consult(RequestRetrieveTransaction request){
		log.info("Client request");
		return Optional.of(client.getTransactions(request));
	}
}
