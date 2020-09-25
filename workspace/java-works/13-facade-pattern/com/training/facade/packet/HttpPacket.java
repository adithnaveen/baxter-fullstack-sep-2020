package com.training.facade.packet;

public class HttpPacket {
	String message; 
	
	public HttpPacket(String message) {
		this.message = message; 
	}
	
	public String response() {
		return message; 
	}
}
