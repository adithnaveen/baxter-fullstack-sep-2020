package com.training.facade.facade;

import com.training.facade.packet.HttpPacket;
import com.training.facade.servlet.FtpServlet;

import com.training.facade.servlet.MailServlet;import com.training.facade.servlet.HttpServlet;

// every servlet type has to be registered here
public class Facade {

	private HttpServlet httpServlet; 
	private FtpServlet ftpServlet; 
	private MailServlet mailServlet; 
	
	public Facade() {
		this.httpServlet = new HttpServlet(); 
		this.ftpServlet = new FtpServlet(); 
		this.mailServlet = new MailServlet(); 
	}
	
	public void serveHttpServlet() {
		httpServlet.service(); 
	}
	
	public void serveHttpServlet(HttpPacket packet) {
		httpServlet.service(packet);
	}
	
	public void serveFtpServlet() {
		ftpServlet.service(); 
	}
	
	public void servetMailServlet() {
		mailServlet.service();
	}
}












