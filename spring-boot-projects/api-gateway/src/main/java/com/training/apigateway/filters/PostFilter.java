package com.training.apigateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(PostFilter.class.getName()); 
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// you can write business logic 
	
			RequestContext currentContext = RequestContext.getCurrentContext(); 
			logger.info("****** Response -> {}", currentContext.getResponseDataStream());
	
		return null;
	}

	// pre, post,error 
	@Override
	public String filterType() {
		 
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1; 
	}

}
