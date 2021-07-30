package com.mrbarin.microservicios.retrievetransactionuser.api.component;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrbarin.microservicios.retrievetransactionuser.api.client.RetrieveCurrentTransactionClient;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;

@Component
public class RetrieveCurrentTransaction {
	
	@Autowired
	private RetrieveCurrentTransactionClient client;
	
	public Optional<ResponseTransactions> consult(RequestRetrieveTransaction request){
		return null;
	}
}
