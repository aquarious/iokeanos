package com.iokeanos.echo;

import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.app.Color;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.Label;
import nextapp.echo.app.Window;

public class HelloWorldApp extends ApplicationInstance {
    


	public Window init() {
        Window window = new Window();

        ContentPane contentPane = new ContentPane();
        window.setContent(contentPane);

        Label label = new Label("Hello, world of Echo 3");
        label.setBackground(Color.GREEN);
        
        contentPane.add(label);
        
        System.out.println("\n\n\n--->" + AppServices.contactService);
        
        if (AppServices.contactService != null){
        	AppServices.contactService.echo();
        	System.out.println("\n\n\n---> nothing happen");
        }
        
        return window;
    }
	
}