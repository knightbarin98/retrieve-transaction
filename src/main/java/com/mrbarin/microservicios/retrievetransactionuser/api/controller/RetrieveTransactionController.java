package com.mrbarin.microservicios.retrievetransactionuser.api.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrbarin.microservicios.retrievetransactionuser.api.annotations.Validate;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ErrorResponse;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;
import com.mrbarin.microservicios.retrievetransactionuser.api.handlerexeception.GlobalException;
import com.mrbarin.microservicios.retrievetransactionuser.api.service.RetrieveTransactionService;

@RestController
public class RetrieveTransactionController {
	
	@Autowired
	private RetrieveTransactionService service;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Validate
	@PostMapping("/retrieve-transaction-user")
	@ResponseBody
	public ResponseEntity<ResponseTransactions> retrieve(@RequestBody String json ) throws Throwable {
		Optional<ResponseTransactions> responseService = service.getTransactions(mapper.readValue(json, RequestRetrieveTransaction.class));
		if(responseService.isPresent()) 
			return new ResponseEntity<>(responseService.get(), HttpStatus.OK);
		else 
			throw new GlobalException(new ErrorResponse(
					"Not Found",
					400,
					"Transaccion no encontrada",
					"La transacción que busca no se encuentra en nuestras bases de datos."
					));
		
	}
}
