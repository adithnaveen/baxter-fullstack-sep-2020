package com.baxter.bootworks.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Localization {

	@Autowired
	MessageSource messageSource; 
	@GetMapping("/hello-world-local")
	public String helloWorldInternalization( @RequestHeader(name="Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("goog.morning.message", null, locale); 
		
	}
}
