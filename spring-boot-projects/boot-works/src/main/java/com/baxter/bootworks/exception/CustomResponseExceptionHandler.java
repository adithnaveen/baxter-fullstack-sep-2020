package com.baxter.bootworks.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.baxter.bootworks.exception.model.ExceptionResponse;

@RestController
@ControllerAdvice
public class CustomResponseExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(
			Exception ex, WebRequest request
	) throws UserNotFoundException {

		// Print the details for the server
		ex.printStackTrace();

		ExceptionResponse response = 
				new ExceptionResponse
				(new Date(), ex.getMessage(),
				request.getDescription(false) , 
				"You can try to send link : http://localhost:<port>/api/db/users/{ValidUserId}");  
		
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND); 
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleGenericException(
			Exception ex, WebRequest request
	) throws Exception {

		// Print the details for the server
		ex.printStackTrace();

		ExceptionResponse response = 
				new ExceptionResponse
				(new Date(), ex.getMessage(),
				request.getDescription(false) , 
				"Sorry Please contact Admin : " + ex.getMessage());  
		
		return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR); 
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ex.printStackTrace(); 
		
		ExceptionResponse response = 
				new ExceptionResponse(new Date(), 
				"Validation Failed", ex.getBindingResult().toString(), 
				"Method Invokcation Problem"); 
		
		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST); 
	}

	
	
	
	
	
	
	
	
}





