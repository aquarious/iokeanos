package com.iokeanos.spring;

import com.iokeanos.spring.service.ContactService;


public class HelloWorld {
	
	
	
	public void start() throws Exception {
        System.out.println("\n\n\n Hello Spring World!! " );
        contactService.echo();
    }
    public void stop() throws Exception {
        System.out.println("\n\n\nGoodbye Spring World!!");
    }


    
    
    ContactService contactService;
    
	
	
    public ContactService getContactService() {
		return contactService;
	}
	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}
}
