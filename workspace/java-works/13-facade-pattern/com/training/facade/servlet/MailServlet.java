package com.training.facade.servlet;

import com.training.facade.contract.Servlet;

public class MailServlet implements Servlet{

	@Override
	public void service() {
		System.out.println("You have SMTP & POP3 implemnetation in mail servlet");
	}

}
