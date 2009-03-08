package com.iokeanos.echo;

import com.iokeanos.spring.service.ContactService;

public class AppServices {
	public static ContactService contactService;

	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}
	
	
	
}
