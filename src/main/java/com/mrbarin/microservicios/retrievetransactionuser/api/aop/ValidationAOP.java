package com.mrbarin.microservicios.retrievetransactionuser.api.aop;

import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ErrorResponse;
import com.mrbarin.microservicios.retrievetransactionuser.api.handlerexeception.GlobalException;
import com.mrbarin.microservicios.retrievetransactionuser.api.handlerexeception.GlobalHandlerException;

@Component
@Aspect
public class ValidationAOP {

	@Autowired
	private ObjectMapper mapper;

	private RequestRetrieveTransaction request;

	@Around("@annotation(com.mrbarin.microservicios.retrievetransactionuser.api.annotations.Validate)")
	public Object requestRetrieveValidation(ProceedingJoinPoint joinPoint) throws Throwable {

		Object[] args = joinPoint.getArgs();
		
		try {
			request = mapper.readValue((String) args[0], RequestRetrieveTransaction.class);
		} catch (IOException e) {
			throw new GlobalException(new ErrorResponse(
					"Internal Server Error",
					500,
					"Error en la estrucutura del request",
					"Los campos no concuerdan con la estructura que debe tener el request, no puede ser parseado"
					));
		}
		
		if(request.getAccountId() == null) throw new GlobalException(new ErrorResponse(
				"Bad Request",
				400,
				"accountId",
				"El campo accoutId no puede estar vacio"
				));
		
		if(request.getBranchId() == null) throw new GlobalException(new ErrorResponse(
				"Bad Request",
				400,
				"branchtId",
				"El campo branchId no puede estar vacio"
				));;
		
		if(request.getTransactionDateStart() == null) throw new GlobalException(new ErrorResponse(
				"Bad Request",
				400,
				"transactionDateStart",
				"El campo transactionDateStart no puede estar vacio"
				));;
		
		if(request.getTransactionDateEnd() == null)throw new GlobalException(new ErrorResponse(
				"Bad Request",
				400,
				"transactionDateEnd",
				"El campo transactionDateEndno puede estar vacio"
				));
		

		return joinPoint.proceed();

	}


}
