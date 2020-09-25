package com.training.facade.client;

import com.training.facade.facade.Facade;
import com.training.facade.packet.HttpPacket;

public class FacadeClient {
	public static void main(String[] args) {
		Facade facade = new Facade(); 
		facade.serveFtpServlet();
		facade.serveHttpServlet();
		facade.serveHttpServlet(new HttpPacket("HTTP-Packet"));
		facade.servetMailServlet();
		
	}
}
