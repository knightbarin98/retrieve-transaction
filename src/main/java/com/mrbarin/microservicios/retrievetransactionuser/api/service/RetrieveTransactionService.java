package com.mrbarin.microservicios.retrievetransactionuser.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrbarin.microservicios.retrievetransactionuser.api.component.RetrieveCurrentTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RetrieveTransactionService {
	
	@Autowired
	private RetrieveCurrentTransaction currentTransaction;
	
	public Optional<ResponseTransactions> getTransactions(RequestRetrieveTransaction request){
		log.info("Service run method for client request");
		Optional<ResponseTransactions> transactions = currentTransaction.consult(request);
		return transactions;
	}

}
