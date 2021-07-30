package com.mrbarin.microservicios.retrievetransactionuser.api.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ValidationAOP {
	
	@Around("@annotation(com.mrbarin.microservicios.retrievetransactionuser.api.annotations.Validate)")
	public void requestRetrieveValidation(ProceedingJoinPoint joinPoint) {
		
	}
	
}
