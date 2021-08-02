package com.mrbarin.microservicios.retrievetransactionuser.api.component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrbarin.microservicios.retrievetransactionuser.api.client.RetrieveCurrentTransactionClient;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response.CurrentResponse;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response.CurrentTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestCurrentTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.Transaction;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RetrieveCurrentTransaction {

	@Autowired
	private RetrieveCurrentTransactionClient client;

	public Optional<ResponseTransactions> consult(RequestRetrieveTransaction request) {
		log.info("Client request");

		StringBuilder builder = new StringBuilder(String.valueOf(request.getAccountId()));
		builder.delete(3, builder.length());
		builder.append(String.valueOf(request.getBranchId()));
		builder.delete(6, builder.length());

		CurrentResponse response = client
				.getTransactions(new RequestCurrentTransaction(Integer.parseInt(builder.toString()),
						request.getTransactionDateStart(), request.getTransactionDateEnd()));

		return Optional.of(getResponseTransactions(response));
	}

	private ResponseTransactions getResponseTransactions(CurrentResponse response) {
		ResponseTransactions retrieveResponse = new ResponseTransactions();
		List<Transaction> transactions = response.getTransactions().stream().map(this::getTransaction)
				.collect(Collectors.toList());
		retrieveResponse.setTransactions(transactions);
		return retrieveResponse;
	}

	private Transaction getTransaction(CurrentTransaction current) {
		Transaction transaction = new Transaction();
		transaction.setDescripcion(current.getTransactionDescription().getDescripcion());
		transaction.setAmount(current.getTransactionDescription().getAmount());
		transaction.setDate(current.getDate());
		transaction.setTransactionType(current.getTransactionDescription().getTransactionType());
		return transaction;
	}
}
