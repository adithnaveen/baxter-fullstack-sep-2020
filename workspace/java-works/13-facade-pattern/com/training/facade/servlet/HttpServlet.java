package com.training.facade.servlet;

import com.training.facade.contract.Servlet;
import com.training.facade.packet.HttpPacket;

public class HttpServlet implements Servlet{

	private HttpPacket packet; 
	
	@Override
	public void service() {
		System.out.println("Http Servlet can handle any http request");
	}
	
	public void service(HttpPacket packet) {
		this.packet = packet; 
		System.out.println("http servlet can handle request with packet");
		System.out.println(packet.response());
	}
	
	
}
