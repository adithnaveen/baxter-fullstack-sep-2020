package com.baxter.bootworks.exception.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
	private Date date; 
	private String message;
	// this is again configurable (server end) 
	private String details; 
	private String myMessage; 
}
