package com.baxter.bootworks;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication

//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.manipal.bootworks"})
public class BootWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWorksApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver(); 
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver; 
	}
	
	@Bean
	public ResourceBundleMessageSource buldleMessageSource() {
		ResourceBundleMessageSource messageSource  = new ResourceBundleMessageSource(); 
		messageSource.setBasename("messages");
		return messageSource; 
	}
}
