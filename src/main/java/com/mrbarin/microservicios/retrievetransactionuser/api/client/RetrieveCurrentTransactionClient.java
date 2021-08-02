package com.mrbarin.microservicios.retrievetransactionuser.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response.CurrentResponse;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestCurrentTransaction;

@FeignClient("RETRIEVE-CURRENT-TRANSACTION")
public interface RetrieveCurrentTransactionClient {
	
	@PostMapping(value="/retrieve-current-information",consumes= MediaType.APPLICATION_JSON_VALUE)
	public CurrentResponse getTransactions(@RequestBody RequestCurrentTransaction request);
}
