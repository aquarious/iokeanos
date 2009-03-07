package com.iokeanos.gui2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost/helloworld.html

public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        resp.setContentType("text/html");
	        resp.getWriter().println("<h3>Hello from HelloWorldServlet2222</h3>");
	    }
}
