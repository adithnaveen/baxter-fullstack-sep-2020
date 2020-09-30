package com.training.apigateway.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(PreFilter.class.getName()); 
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// you can write business logic 
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest(); 
		logger.info("---- Request -> {}, request URI-> {}", request, request.getRequestURI());
		return null;
	}

	// pre, post,error 
	@Override
	public String filterType() {
		 
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1; 
	}

}
