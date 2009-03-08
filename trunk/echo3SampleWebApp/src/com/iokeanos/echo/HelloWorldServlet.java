package com.iokeanos.echo;

import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.webcontainer.WebContainerServlet;

import org.osgi.framework.BundleContext;

public class HelloWorldServlet extends WebContainerServlet{//HttpServlet {
    private BundleContext bundleContext;
	public HelloWorldServlet(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
	
/*	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h3>Hello from HelloWorldServlet233333</h3>");
    }*/
	public ApplicationInstance newInstance() {
        return new HelloWorldApp();
    }

	public ApplicationInstance newApplicationInstance() {
		return new HelloWorldApp();
	}
    
}