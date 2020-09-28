package com.baxter.bootworks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
// you dont have to specify it here because it handled in  CustomResponseExceptionHandler
//@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception{
	private String message;
}
