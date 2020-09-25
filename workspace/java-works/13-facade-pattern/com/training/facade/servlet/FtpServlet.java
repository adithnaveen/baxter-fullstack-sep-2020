package com.training.facade.servlet;

import com.training.facade.contract.Servlet;

public class FtpServlet implements Servlet {

	@Override
	public void service() {
		System.out.println("FTP Servlet can transer data in/out");
	}

}
