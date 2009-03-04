package com.iokeanos.echo;

import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.webcontainer.WebContainerServlet;

public class HelloWorldServlet extends WebContainerServlet {
    public ApplicationInstance newInstance() {
        return new HelloWorldApp();
    }

	public ApplicationInstance newApplicationInstance() {
		return new HelloWorldApp();
	}
    
}