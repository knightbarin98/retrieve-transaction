package com.mrbarin.microservicios.retrievetransactionuser.api.handlerexeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ErrorResponse;

@ControllerAdvice
public class GlobalHandlerException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(GlobalException.class)
    public ResponseEntity<Object> handleExceptions( GlobalException exception, WebRequest webRequest) {
        ErrorResponse error = exception.getErrorResponse();
        ResponseEntity<Object> entity = new ResponseEntity<>(error,getHttpSatus(error));
        return entity;
    }

	private HttpStatus getHttpSatus(ErrorResponse error) {
		switch (error.getCode()) {
		case 400:
			return HttpStatus.BAD_REQUEST;
		case 500:
			return HttpStatus.INTERNAL_SERVER_ERROR;
		case 404:
			return HttpStatus.NOT_FOUND;
		}
		
		return HttpStatus.ACCEPTED;
	}

}
